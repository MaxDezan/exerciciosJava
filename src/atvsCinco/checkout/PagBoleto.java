package atvsCinco.checkout;

public class PagBoleto extends PagBase {
    private boolean aguardandoCompensacao = true;

    @Override
    public String processar(float valor) {
        idTransacao = java.util.UUID.randomUUID().toString();
        aprovado = false;
        System.out.println("Boleto gerado. Aguarde compensação em 24h. ID: " + idTransacao);
        return idTransacao;
    }

    public void compensar() {
        if (aguardandoCompensacao) {
            aguardandoCompensacao = false;
            aprovado = true;
            System.out.println("Boleto compensado! Pagamento aprovado. ID: " + idTransacao);
        }
    }
}
