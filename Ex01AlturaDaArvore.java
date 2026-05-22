public class Ex01AlturaDaArvore {
    private static class Node{
        String nome;
        Node left;
        Node rigth;
    

    private Node(String nome){
        this.nome = nome;
    }
}

public static int altura(Node raiz){
    if (raiz ==null){
        return 0;
    }
    int AlturaEsquerdo = altura(raiz.left);
    int AlturaDireito = altura(raiz.rigth);

        return 1 + Math.max(AlturaEsquerdo, AlturaDireito);
  
}

public static void main(String[] args) {
    Node raiz = new Node("arvore");
    raiz.left = new Node("filho");
    raiz.left.left = new Node("primo");
    raiz.left.left= new Node("segundo grau de primo");
    raiz.left.left.left = new Node("Nem e mais familia");
    raiz.left.left.left.left = new Node("esquece");
  
    System.out.println(" Altura e = " + altura(raiz));
    
}
}
