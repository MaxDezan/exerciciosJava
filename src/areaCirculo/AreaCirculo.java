package areaCirculo;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int raio = sc.nextInt();

        // cálculo com float
        float areaFloat = (float) (Math.PI * raio * raio);

        // cálculo com double
        double areaDouble = Math.PI * raio * raio;

        System.out.printf("Área com float: %.6f%n", areaFloat);
        System.out.printf("Área com double: %.15f%n", areaDouble);

        sc.close();
    }
}

