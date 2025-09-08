package atvsUm.divisao;

import java.util.Scanner;

public class Dividir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.print("Digite o dividendo: ");
        double a = sc.nextDouble();

        System.out.print("Digite o divisor: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Divisão por zero não permitida.");
        } else {
            double resultado = a / b;
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}
