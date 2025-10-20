package logicaDesafios.cnpjValidar;

import java.util.Scanner;

public class Cnpj {
    public static void verificar(String digitos) {
        digitos = digitos.replaceAll("\\D", "");
        int soma = 0;
        for (int i = 0; i < digitos.length(); i++) {
            char c = digitos.charAt(i);
            soma += Character.getNumericValue(c);
        }

        int dezena = soma / 10;
        int unidade = soma % 10;

        if (digitos.length() == 14 && soma >= 10 && soma <= 99 && (dezena + unidade == 9)) {
            System.out.println("CNPJ Válido!");
        } else {
            System.out.println("CNPJ Inválido!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um CNPJ para validar: ");
        String digitos = sc.next();
        verificar(digitos);
    }
}
