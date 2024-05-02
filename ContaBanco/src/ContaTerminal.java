import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kaio Abreu
 * @version 1.0
 * @since 02/05/2024 11:30
 *
 */

public class ContaTerminal {

    public static void main(String[] args) {

        //Importando e realizando a instância do objeto da classe Scanner
        Scanner sc = new Scanner(System.in);

        //Impondo que o programa seja realizado na versão dos EUA referente aos pontos flutuantes
        Locale.setDefault(Locale.US);

        //Solicitando o número da Agência
        System.out.println("Por favor, digite o número da Agência! :");
        int numeroAgencia = sc.nextInt();

        //Solicitando a conta da Agência
        System.out.println("Por favor, informe sua conta da Agência! :");
        String contaAgencia = sc.next();

        //Solicitando o primeiro nome do Cliente
        System.out.println("Por favor, insira seu primeiro nome! :");
        String nomeCliente = sc.next();

        //Solicitando o sobrenome do Cliente
        System.out.println("Por favor, insira seu sobrenome! :");
        String sobrenomeCliente = sc.next();

        //Solicitando o valor do saque
        System.out.println("Por favor, insira seu saldo para saque! :");
        double saque = sc.nextDouble();

        //Fazendo a chamada do método concat() e passando as variáveis como argumentos
        concat(nomeCliente, sobrenomeCliente, numeroAgencia, contaAgencia, saque);

        sc.close();
    }

    /** Método void para concatenar strings e números tanto inteiro como double.
     * Com a finalidade de mostrar os detalhes de uma conta no Banco.
     * @param str1 serve para imprimir o primeiro nome de um Cliente.
     * @param str2 serve para imprimir o sobrenome de um Cliente.
     * @param str3 serve para imprimir o número da Agência.
     * @param str4 serve para imprimir a conta da Agência de um Cliente.
     * @param str5 serve para imprimir o valor de um saque emitido por um Cliente.
     */
    public static void concat(String str1, String str2, int str3, String str4, double str5) {
        System.out.println("Olá " + str1 + " " + str2 + ", obrigado por criar uma conta em nosso banco, sua agência é " + str3 + ", conta " + str4 + " e seu saldo " + str5 + " já está disponível para saque.");
    }

}
