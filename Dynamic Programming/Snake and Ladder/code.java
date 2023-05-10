/* Given a 5x6 snakes and ladders board, find the minimum number of dice throws required to reach the destination 
or last cell (30th cell) from the source (1st cell).
You are given an integer N denoting the total number of snakes and ladders and an array arr[] of 2*N size where 2*i 
and (2*i + 1)th values denote the starting and ending point respectively of ith snake or ladder. The board looks like the following.
Note: Assume that you have complete control over the 6 sided dice. No ladder starts from 1st cell. */

class Solution{
    static class qentry {
        int v; // Vertex number
        int dist; // Distance of this vertex from source
    }

    static int minThrow(int n, int move[]) {
        int visited[] = new int[n];
        Queue<qentry> q = new LinkedList<>();
        qentry qe = new qentry();
        qe.v = 0;
        qe.dist = 0;

        // Mark the node 0 as visited and enqueue it.
        visited[0] = 1;
        q.add(qe);

        // Do a BFS starting from vertex at index 0
        while (!q.isEmpty()) {
            qe = q.remove();
            int v = qe.v;

            // If front vertex is the destination vertex, we are done
            if (v == n - 1)
                break;

            // Otherwise, dequeue the front vertex and enqueue its adjacent vertices (or cell
            // numbers reachable through a dice throw)
            for (int j = v + 1; j <= v + 6 && j < n; ++j) {
                // If this cell is already visited, then ignore
                if (visited[j] == 0) {
                    // Otherwise, calculate its distance and mark it as visited
                    qentry a = new qentry();
                    a.dist = qe.dist + 1;
                    visited[j] = 1;

                    // Check if there is a ladder or snake at 'j'
                    // If so, set the destination as the adjacent cell
                    if (move[j] != -1)
                        a.v = move[j];
                    else
                        a.v = j;
                    q.add(a);
                }
            }
        }
        return qe.dist;
    }
}
