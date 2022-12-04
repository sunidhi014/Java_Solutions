For a given Binary Tree of integers, find and return the height of the tree.
  
int height (BinaryTreeNode<int> *root) {
if(root == NULL) {
  return 0;
}
return max(height (root->left), height(root->right)) + 1;
  }
}
