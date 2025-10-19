package atvsCinco.checkout;

public class PagCartao extends PagBase {
    private static final float TAXA_FIXA = 1.5f;
    private static final float TAXA_PERCENTUAL = 0.03f;

    @Override
    public String processar(float valor) {
        if (valor <= 0) {
            System.out.println("Pagamento no cartão de valor inválido. Pagamento não processado");
            aprovado = false;
            return null;
        } else {
        float total = valor + TAXA_FIXA + (valor * TAXA_PERCENTUAL);
        System.out.println("💳 Pagamento no cartão com taxas: R$ " + total);
        return super.processar(total);
    }
        }
}
