package atvsCinco.checkout;

public class Checkout {
    public void realizarPagamento(AcoesFinanceiro metodo, float valor) {
        String id = metodo.processar(valor);
        if (id != null) {
            System.out.println("Transação registrada: " + id);
        }
    }

    public void realizarEstorno(AcoesFinanceiro metodo, String idTransacao) {
        metodo.estornar(idTransacao);
    }
}
