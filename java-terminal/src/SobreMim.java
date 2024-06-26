import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.print("Digite seu nome: ");
            String nome = sc.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

        sc.close();
    }
}
