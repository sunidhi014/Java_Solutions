/* Given a 5x6 snakes and ladders board, find the minimum number of dice throws required to reach the destination 
or last cell (30th cell) from the source (1st cell).
You are given an integer N denoting the total number of snakes and ladders and an array arr[] of 2*N size where 2*i 
and (2*i + 1)th values denote the starting and ending point respectively of ith snake or ladder. The board looks like the following.
Note: Assume that you have complete control over the 6 sided dice. No ladder starts from 1st cell. */



// User function Template for Java

class Solution{
    static int minThrow(int n, int arr[]) {

        // Create a 1D array of the board with size 31

        int[] board = new int[31];

        // Fill all values in the board with -1

        Arrays.fill(board, -1);

        // Loop through the input array and update the board with special cells

        for (int i = 0; i <= arr.length - 2; i += 2) {

            board[arr[i]] = arr[i + 1];

        }

        // Create a queue to store cells to be visited

        Queue<Integer> queue = new LinkedList<>();

        // Offer cell 1 to the queue

        queue.offer(1);

        // Create a boolean array to keep track of visited cells

        boolean[] visited = new boolean[31];

        // Initialize a variable to keep track of number of dice throws

        int move = 0;

        // Keep looping until the queue is empty

        while (!queue.isEmpty()) {

            // Get the number of elements in the queue

            int qsize = queue.size();

            // Loop through all elements in the queue

            for (int size = qsize; size > 0; size--) {

                // Get the next cell from the queue

                int num = queue.poll();

                // If the cell has been visited, continue to the next iteration

                if (visited[num])

                    continue;

                // Mark the cell as visited

                visited[num] = true;

                // Check if the cell is cell 30

                if (num == 30)

                    return move;

                // Loop through the possible dice throws (1 to 6)

                for (int i = 1; i <= 6 && num + i <= 30; i++) {

                    int next = num + i;

                    // Check if the next cell has a special value in the board

                    if (board[next] != -1)

                        next = board[next];

                    // If the next cell has not been visited, offer it to the queue

                    if (!visited[next])

                        queue.offer(next);

                }

            }

            // Increment the number of dice throws

            move++;

        }

        // Return -1 if cell 30 could not be reached

        return -1;

    } 
}
