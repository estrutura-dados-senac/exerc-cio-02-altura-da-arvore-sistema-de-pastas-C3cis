public class Ex3AlturaDeUmNo {
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
    public static int profundidade(Node raiz, String nomeProcurado, int nivel){
        if (raiz == null){
            return -1;
        }
        if (raiz.nome.equals(nomeProcurado)) {
            return nivel;
        }
          int  resultadoEsquerdo = profundidade(raiz.left, nomeProcurado, nivel + 1);
          if ( resultadoEsquerdo != -1){
            return resultadoEsquerdo;
          }
          return profundidade(raiz.rigth, nomeProcurado, nivel + 1);
        }
     public static int alturaDoNo(Node raiz){
            if (raiz ==null){
                return 0;
            }
            int AlturaEsquerdo = altura(raiz.left);
            int AlturaDireito = altura(raiz.rigth);
        
                return -1 + Math.max(AlturaEsquerdo, AlturaDireito);
        }
         

        public static void main(String[] args) {
            Node raiz = new Node("arvore");
            raiz.left = new Node("filho");
            raiz.left.left = new Node("primo");
            raiz.left.left= new Node("segundo grau de primo");
            raiz.left.left.left = new Node("Nem é mais familia");
            
            raiz.rigth = new Node("tia");
            raiz.rigth.rigth= new Node("tia avó");
            raiz.rigth.rigth.rigth= new Node("tia bisavó");
            raiz.rigth.rigth.rigth.rigth= new Node("tia tataravó");
            
            raiz.rigth.left = new Node("tudo primo");
    
            String alvo = "tia tataravó";
            int teste = profundidade(raiz, alvo, 0);
    
            if (teste != -1) {
                System.out.println("A profundidade do nó '" + alvo + "' é  " + teste);
            } else {
                System.out.println("Nó '" + alvo + "' não encontrado.");
            }
    
            System.out.println("A altura da árvore é: " + altura(raiz));
            System.out.println("A altura do Nó é: " + alturaDoNo(raiz));
        
    
        }

    }


