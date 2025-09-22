package avaliacaoTerca;

public class Municipio {
    private String nome;
    private Estado estado;

    public Municipio(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nome='" + nome + '\'' +
                ", estado=" + estado +
                '}';
    }
}
