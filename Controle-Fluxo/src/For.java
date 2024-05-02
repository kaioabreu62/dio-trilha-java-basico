public class For {

    public static void main(String[] args) {

        /* For
        O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.
        A estrutura de sintaxe do controle de repetição
        for
         é exibida abaixo:
            Copy
            //estrutura do controle de fluxo for

            for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
            {
                 // comando que será executado até que a
                 // expressão de validação torne-se falsa
            }

        Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:

            Copy
            // ExemploFor.java
            public class ExemploFor {
                public static void main(String[] args) {
                    for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
                        System.out.println(carneirinhos + " - Carneirinho(s)");
                    }
                }
            }
            Vamos explicar a estrutura do código acima:

            For position

            int carneirinhos = 1; -> O programa entende que a variável carneirinhos, começa com o valor igual a 1 e isso acontece somente uma vez;

            carneirinhos < = 20; -> O programa verifica se a variável carneirinhos, ainda é menor que 20;

            O programa começa a executar o algoritmo, no nosso caso, imprimir a quantidade de carneirinhos em contagem;

            carneirinhos ++ -> O programa aumenta em mais 1, o valor da variável carneirinhos;

            O fluxo é finalizado, quando a variável carneirinhos for igual a 20.

         */
    }
}
