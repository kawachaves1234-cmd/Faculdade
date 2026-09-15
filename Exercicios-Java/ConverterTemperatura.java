import java.util.Scanner;

public class ConverterTemperatura{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius para converter:");
        double C = scan.nextDouble(); 
        double F = (C * 1.8) + 32; 

        System.out.print(F);

        scan.close(); 

    }
}