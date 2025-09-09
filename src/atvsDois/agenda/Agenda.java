package atvsDois.agenda;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = sc.nextLine();

        System.out.print("Digite o telefone do contato: ");
        String telefone = sc.nextLine();

        contatos.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato() {
        System.out.print("Digite o nome do contato a remover: ");
        String nome = sc.nextLine();

        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
        System.out.println("Se o contato existia, foi removido.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato contato : contatos) {
                System.out.println("Nome: " + contato.getNome() + " | Telefone: " + contato.getTelefone());
            }
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Agenda ---");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Listar contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> agenda.addContato();
                case 2 -> agenda.removerContato();
                case 3 -> agenda.listarContatos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}