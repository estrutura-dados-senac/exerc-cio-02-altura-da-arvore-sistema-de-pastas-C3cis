import java.util.ArrayList;
import java.util.List;

public class Ex05_PreOrdem{
      private static class Node{
            String id;
            Node left;
            Node right;
        
        private Node(String id){
            this.id = id;
        }
   public static List<String> preOrdem(Node raiz) {

        List<String> resultado = new ArrayList<>();
        
        preOrdemRec(raiz, resultado);
        
        return resultado;
    }

    private static void preOrdemRec(Node atual, List<String> resultado) {
        if (atual == null) {
            return;
        }
        resultado.add(atual.id);
        preOrdemRec(atual.left, resultado);
        preOrdemRec(atual.right, resultado);
    }

    public static void main(String[] args) {
        Node raiz = new Node("Inicio");
        raiz.left = new Node("1_Deploy");
        raiz.right = new Node("2_App");
        raiz.left.right = new Node("3_testes");
        raiz.right.right = new Node("3_Docker");
        raiz.right.right.left = new Node("4_finalizacao");


        List<String> execusoes = preOrdem(raiz);

        System.out.println("A ordem de execusao do deploy e: ");
        for (String etapa : execusoes){
            System.out.println("Lista: "+ etapa);
        }

    }
        }

}