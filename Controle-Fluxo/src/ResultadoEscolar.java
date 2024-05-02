public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 8;

        /*if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
         */

        //1º Cenário do uso de Condição Ternária
        String resultado = (nota >= 7) ? "APROVADO" : "REPROVADO";
        System.out.println(resultado);

        //2º Cenário do uso de Condição Ternária
        nota = 6;
        resultado = (nota >= 7) ? "APROVADO" : (nota >= 5 && nota < 7) ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(resultado);
    }
}
