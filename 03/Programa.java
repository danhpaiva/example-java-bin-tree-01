public class Programa {
  public static void main(String[] args) {
    NoArvoreBin raiz = null;

    raiz = ArvoreBin.insert(raiz, 10);
    raiz = ArvoreBin.insert(raiz, 5);
    raiz = ArvoreBin.insert(raiz, 20);
    raiz = ArvoreBin.insert(raiz, 1);
    raiz = ArvoreBin.insert(raiz, 7);
    raiz = ArvoreBin.insert(raiz, 33);
    raiz = ArvoreBin.insert(raiz, 2);
    raiz = ArvoreBin.insert(raiz, 30);

    System.out.print("\nPreorder: ");
    ArvoreBin.preOrder(raiz);

    System.out.print("\nInorder: ");
    ArvoreBin.inOrder(raiz);

    System.out.print("\nPostorder: ");
    ArvoreBin.postOrder(raiz);
  }
}
