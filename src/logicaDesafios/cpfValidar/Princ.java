package logicaDesafios.cpfValidar;

import java.util.Scanner;

public class Princ {
    public static void verificar(String digitos) {
        int soma = 0;
        for (int i = 0; i < digitos.length(); i++) {
            char c = digitos.charAt(i);
            soma += Character.getNumericValue(c);
        }
        if (digitos.length() == 11 && soma / 10 == soma % 10 ) {
            System.out.println("CPF Válido!");
        } else {
            System.out.println("CPF Inválido!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um cpf para validar: ");
        String digitos = sc.next();
        verificar(digitos);
    }
}
