package atvsUm.nome;
import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu atvsUm.nome: ");
        String nome = sc.nextLine();
        System.out.println("A primeira letra do seu atvsUm.nome é " + nome.charAt(0));
    }
}
