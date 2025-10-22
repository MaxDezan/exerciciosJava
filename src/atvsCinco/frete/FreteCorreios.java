package atvsCinco.frete;

public class FreteCorreios extends FreteBase{
    @Override
    public double valor(double peso, String cep) {
        if (cepInvalido(cep)) return 0;
        if (peso <= 1.0) {
            return 15.0;
        } else if (peso <= 5.0) {
            return 25.0;
        } else {
            return 40.0;
        }
    }

    @Override
    public int prazo(String cep) {
        if (cepInvalido(cep)) return 0;

        if (cep.startsWith("9")) {
            return 3;
        } else if (cep.startsWith("8")) {
            return 5;
        } else {
            return 7;
        }
    }
}
