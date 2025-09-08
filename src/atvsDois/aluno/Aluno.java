package atvsDois.aluno;

public class Aluno  {
    private String nome;
    private int nota;

    public Aluno (String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public int getNota() {
        return nota;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void aprovado() {
        boolean verificar = nota >= 7;
        System.out.println("Olá " + nome + ", sua nota é " + nota + ".");
        if (verificar) {
            System.out.println("Aprovado.");
        }
        else {
            System.out.println("Reprovado.");
        }
    }
}
