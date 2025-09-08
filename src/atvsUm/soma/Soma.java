package atvsUm.soma;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);
        /*System.out.println("Digite dois valores para somar");
        System.out.println("Primeiro valor: ");int a = sc.nextInt();
        System.out.println("Segundo valor: ");int b = sc.nextInt();
        System.out.println("A atvsUm.soma vale: " + (a + b));
        sc.close();*/

        System.out.print("Digite o primeiro número decimal: ");
        double c = sc.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        double d = sc.nextDouble();

        double soma = c + d;
        System.out.println("A atvsUm.soma vale: " + soma);

        sc.close();
    }
}

