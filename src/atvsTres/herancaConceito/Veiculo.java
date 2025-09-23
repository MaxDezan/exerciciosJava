package atvsTres.herancaConceito;

public class Veiculo {
    private String cor;
    private String placa;

    public Veiculo(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo: " + getClass().getSimpleName() +
                ", Cor:'" + cor + '\'' +
                ", Placa:'" + placa + '\'';
    }
}
