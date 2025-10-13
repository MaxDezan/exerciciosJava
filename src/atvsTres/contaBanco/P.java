package atvsTres.contaBanco;

import java.util.Scanner;


public class P {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Max", "0489239843");
        ContaBancaris cb1 = new ContaBancaris(1293, 500.00, c1);
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        System.out.print("Bem-vindo(a) ao menu de sua conta bancaria.");
        while (opcao != 4) {
            System.out.println("\nDigite a opção desejada para prosseguir\n");
            System.out.print(" 1-Depositar\n 2-Sacar\n 3-Ver saldo\n 4-Sair\n");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = sc.nextDouble();
                    cb1.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = sc.nextDouble();
                    cb1.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println("Saldo atual: " + cb1.getSaldo());
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
