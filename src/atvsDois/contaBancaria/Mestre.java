package atvsDois.contaBancaria;

import java.math.BigDecimal;
import java.util.Scanner;

public class Mestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        ContaBancaria conta = new ContaBancaria(123, "Maria", BigDecimal.ZERO);

        int opcao;
        do {
            System.out.println("\n==== MENU CONTA BANCÁRIA ====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    BigDecimal valorDeposito = sc.nextBigDecimal();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    BigDecimal valorSaque = sc.nextBigDecimal();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 0:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
