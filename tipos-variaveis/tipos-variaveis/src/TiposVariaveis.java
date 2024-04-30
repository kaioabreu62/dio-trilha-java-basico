public class TiposVariaveis {
    public static void main(String[] args) {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        /* Tipos Primitivos do Java
        byte = 1 byte
        short = 2 byte
        int = 4 bytes
        long = 8 bytes
        float = 4 bytes
        double 8 bytes

        Estrutura padrao de para se declarar uma variavel:
        <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

        Java eh fortemente tipado

        Para declarar uma variavel constante, devemos utilizar
        a palavra final e por convenção a variavel deve ser escrita em caixa alta.
         */
    }
}
