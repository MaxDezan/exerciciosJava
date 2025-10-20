package logicaDesafios.placaValidar;

import java.util.Scanner;

public class Placa {
    public static void verificar(String digitos) {
        boolean valido = digitos.length() == 8;
        for (int i = 0; i < 3; i++) {
            char c = digitos.charAt(i);
            if (!Character.isUpperCase(c)) {
                valido = false;
                break;
            }
        }
        if (digitos.charAt(3) != '-') {
            valido = false;
        }
        int soma = 0;
        for (int i = 4; i < 8; i++) {
            char c = digitos.charAt(i);
            if (!Character.isDigit(c)) {
                valido = false;
                break;
            }
            soma += Character.getNumericValue(c);
        }
        if (soma % 2 != 0) {
            valido = false;
        }
        if (valido) {
            System.out.println("Placa válida");
        } else {
            System.out.println("Placa inválida");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma placa para validar: ");
        String digitos = sc.next();
        verificar(digitos);
    }
}
