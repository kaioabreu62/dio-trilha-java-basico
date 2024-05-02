public class SwitchCase {

    public static void main(String[] args) {
        /* Switch Case
        A estrutura switch, compara o valor de cada caso, com o da variável sequencialmente e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas, após um caso correspondente ter sido encontrado, acrescentamos o comando break no final de cada bloco de códigos. O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.

        Vamos imaginar que precisaremos imprimir uma medida, com base em mapa de valores, exemplo:
        Sigla	Tamanho
        P        PEQUENO

        M        MÉDIO

        G        GRANDE

        // SistemaMedida.java

        // Modo condicional if/else
        public class SistemaMedida {
            public static void main(String[] args) {
                String sigla = "M";

                if(sigla == "P")
                    System.out.println("PEQUENO");
                else if(sigla == "M")
                    System.out.println("MÉDIO");
                else if(sigla == "G")
                    System.out.println("GRANDE");
                else
                    System.out.println("INDEFINIDO");
            }
        }

        / SistemaMedida.java

        // Modo condicional switch / case
        public class SistemaMedida {
            public static void main(String[] args) {
                String sigla = "M";

                switch (sigla) {
                case "P":{
                    System.out.println("PEQUENO");
                    break;
                }
                case "M":{
                    System.out.println("MÉDIO");
                    break;
                }
                case "G":{
                    System.out.println("GRANDE");
                    break;
                }
                default:
                    System.out.println("INDEFINIDO");
                }
            }
        }

        */
    }
}
