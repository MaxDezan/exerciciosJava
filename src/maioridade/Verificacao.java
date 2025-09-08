package maioridade;

import java.util.Scanner;

public class Verificacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        boolean maiorDeIdade = idade >= 18;

        System.out.println(maiorDeIdade);
    }
}
