package atvsCinco.frete;

public class FreteMotoboy extends FreteBase{
    @Override
    public double valor(double peso, String cep) {
        if (!cep.startsWith("9")) return 0;
        return 10 + peso * 2;
    }

    @Override
    public int prazo(String cep) {
        if (!cep.startsWith("9")) return 0;
        return 1;
    }
}
