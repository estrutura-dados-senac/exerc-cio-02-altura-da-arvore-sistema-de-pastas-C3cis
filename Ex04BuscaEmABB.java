public class Ex04BuscaEmABB {
        private static class Node{
            String id;
            Node left;
            Node right;
        
        private Node(String id){
            this.id = id;
        }
    
        }
    public static boolean buscar(Node raiz, String codigoProcurado) {
       
        Node atual = raiz;
        
        while (atual != null) {
        
            if (codigoProcurado.equals(atual.id)) {
                return true;
            }
        
            if (codigoProcurado.compareTo(atual.id) < 0) {
                atual = atual.left;
            } else {

                atual = atual.right;
            }
        }
        return false;
    }
    public static Node inserir(Node raiz, String id) {
        if (raiz == null) {
            return new Node(id);
        }
        if (id.compareTo(raiz.id) < 0) {
            raiz.left = inserir(raiz.left, id);
        } else if (id.compareTo(raiz.id) > 0) {
            raiz.right = inserir(raiz.right, id);
        }
        return raiz;
    }
        public static void main(String[] args) {
        Node raiz = null;
        raiz = inserir(raiz, "Sabonete");
        raiz = inserir(raiz, "Detergente");
        raiz = inserir(raiz, "Shampoo");

            String alvo = "ype";
            boolean teste = buscar(raiz, alvo);
                System.out.println("O codigo do catalogo '" +  alvo + "' e  " + teste);
            
}
}
