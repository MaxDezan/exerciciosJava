package atvsUm.cofrinho;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cofre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        BigDecimal cofre = BigDecimal.ZERO;

        System.out.println("Bem-vindo(a) ao seu cofrinho.");
        System.out.print("Digite quanto deseja depositar: ");
        BigDecimal depositar = sc.nextBigDecimal();
        cofre = cofre.add(depositar);

        System.out.println("Depósito concluído. O saldo atual é de R$" + cofre);

        sc.close();
    }
}
