package herancaConceito;

public class Moto extends Veiculo{
    private boolean temBau;

    public Moto(String cor, String placa, boolean temBau) {
        super(cor, placa);
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tem baú: " + (temBau ? "Sim" : "Não");
    }
}
