public class ArvoreBin {
  public static NoArvoreBin insert(NoArvoreBin node, int value) {
    if (node == null) {
      return new NoArvoreBin(value);
    }

    if (value < node.data) {
      node.left = insert(node.left, value);
    } else {
      node.right = insert(node.right, value);
    }
    return node;
  }

  public static void preOrder(NoArvoreBin node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " "); // Visit root first
    preOrder(node.left);
    preOrder(node.right);
  }

  public static void inOrder(NoArvoreBin node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.data + " "); // Visit root in-between
    inOrder(node.right);
  }

  public static void postOrder(NoArvoreBin node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " "); // Visit root last
  }

  public static NoArvoreBin delete(NoArvoreBin root, int value) {
    if (root == null) {
      return null; // Node not found
    }

    if (value < root.data) {
      root.left = delete(root.left, value);
    } else if (value > root.data) {
      root.right = delete(root.right, value);
    } else {
      // Node found for deletion
      if (root.left == null) {
        return root.right; // Replace with right child
      } else if (root.right == null) {
        return root.left; // Replace with left child
      } else {
        // Node has two children
        // Find the minimum value in the right subtree (successor)
        NoArvoreBin successor = root.right;
        while (successor.left != null) {
          successor = successor.left;
        }

        // Replace current node with the successor
        root.data = successor.data;

        // Delete the successor (which now has at most one child)
        root.right = delete(root.right, successor.data);
      }
    }
    return root;
  }
}