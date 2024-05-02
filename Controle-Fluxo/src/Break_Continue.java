public class Break_Continue {

    public static void main(String[] args) {

        /* Break e Continue
            Break significa quebrar, parar, frear, interromper. E é isso que se faz, quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o laço.
            O comando break interrompe o laço, já o continue interrompe somente a iteração atual.

            Copy
            // class ExemploBreakContinue.java
            public class ExemploBreakContinue {
                public static void main(String[] args) {

                for(int numero = 1; numero <=5; numero ++){
                    if(numero==3)
                        break;

                    System.out.println(numero);

                }
                //Qual a saída no console ?

                }
            }

            Copy
            // class ExemploBreakContinue.java
            public class ExemploBreakContinue {
                public static void main(String[] args) {

                for(int numero = 1; numero <=5; numero ++){
                    if(numero==3)
                        continue;

                    System.out.println(numero);

                }
                //Qual a saída no console ?
                    1
                    2
                }
            }

            // class ExemploBreakContinue.java
            public class ExemploBreakContinue {
                public static void main(String[] args) {

                for(int numero = 1; numero <=5; numero ++){
                    if(numero==3)
                        continue;

                    System.out.println(numero);

                }
                //Qual a saída no console ?
                    1
                    2
                    4
                    5
                }
            }

            Observem que sempre o break e continue ``, está condicionado a um critério de negócio.
         */
    }
}

