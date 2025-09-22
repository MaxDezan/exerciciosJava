package avaliacaoTerca;

public class Cliente {
    private String nome;
    private int anoNascimento;
    private Endereco endereco;

    public Cliente(String nome, int anoNascimento, Endereco endereco) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + '\'' +
                ", Data de Nascimento=" + anoNascimento +
                ", Endereço=" + endereco;
    }
}
