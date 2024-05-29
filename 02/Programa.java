public class Programa {
  public static void main(String[] args) {
    No root = null;

    root = ArvoreBin.insert(root, 1);
    root = ArvoreBin.insert(root, 2);
    root = ArvoreBin.insert(root, 3);
    root = ArvoreBin.insert(root, 4);
    root = ArvoreBin.insert(root, 5);
    root = ArvoreBin.insert(root, 6);
    root = ArvoreBin.insert(root, 7);
    root = ArvoreBin.insert(root, 8);
    root = ArvoreBin.insert(root, 9);
    root = ArvoreBin.insert(root, 10);

    System.out.print("\nPreorder traversal: ");
    ArvoreBin.preorderTraversal(root);

    System.out.print("\nInorder traversal: ");
    ArvoreBin.inorderTraversal(root);

    System.out.print("\nPostorder traversal: ");
    ArvoreBin.postorderTraversal(root);

    System.out.print("\nLevel order traversal: ");
    ArvoreBin.levelorderTraversal(root);

    root = ArvoreBin.deletion(root, 20);

    System.out.print("\nInorder traversal after deletion: ");
    ArvoreBin.inorderTraversal(root);
  }
}
