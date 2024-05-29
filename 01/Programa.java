public class Programa {
  public static void main(String[] args) {
    NoArvoreBin raiz = null;

    raiz = ArvoreBin.insert(raiz, 20);
    raiz = ArvoreBin.insert(raiz, 10);
    raiz = ArvoreBin.insert(raiz, 9);
    raiz = ArvoreBin.insert(raiz, 30);
    raiz = ArvoreBin.insert(raiz, 25);

    System.out.print("\nPreorder: ");
    ArvoreBin.preOrder(raiz);

    System.out.print("\nInorder: ");
    ArvoreBin.inOrder(raiz);

    System.out.print("\nPostorder: ");
    ArvoreBin.postOrder(raiz);
  }
}
