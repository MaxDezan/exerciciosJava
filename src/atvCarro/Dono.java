package atvCarro;

public class Dono {

    private String nome;
    private String cpf;

    public Dono(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
