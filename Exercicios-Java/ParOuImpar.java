
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que vai ser verificado:");

        int num = scan.nextInt();

        if (num % 2 == 0) {

            System.out.println("O número é par!");

        } else {

            System.out.println("O número é ímpar!");
        }

        scan.close();
    }

}
