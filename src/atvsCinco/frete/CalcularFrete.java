package atvsCinco.frete;

public interface CalcularFrete {
    double valor(double peso, String cep);
    int prazo(String cep);
}
