package mediaAritmetica;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores para realizar a média aritmética.");
        System.out.println("Valor 1: ");
        int a = sc.nextInt();
        System.out.println("Valor 2: ");
        int b = sc.nextInt();
        System.out.println("Valor 3: ");
        int c = sc.nextInt();

        double media = (a + b + c) / 3.0;

        System.out.printf("A média é %.2f%n", media);
    }

}
