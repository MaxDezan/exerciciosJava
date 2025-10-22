package atvsCinco.frete;

public abstract class FreteBase implements CalcularFrete{
    protected int dias;

    protected boolean cepInvalido(String cep) {
        return cep == null || !cep.matches("\\d{8}");
    }

    @Override
    public double valor(double peso, String cep) {
        return 0;
    }

    @Override
    public int prazo(String cep) {
        if (cepInvalido(cep)) return 0;
        return dias;
    }

}
