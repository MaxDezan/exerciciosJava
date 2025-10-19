package atvsCinco.checkout;

public interface AcoesFinanceiro {
    String processar(float valor);
    void estornar(String idTransacao);
}
