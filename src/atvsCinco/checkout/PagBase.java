package atvsCinco.checkout;

import java.util.UUID;

public abstract class PagBase implements AcoesFinanceiro {
    protected String idTransacao;
    protected boolean aprovado;

    @Override
    public String processar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. Pagamento não processado");
            aprovado = false;
            return null;
        } else {
            idTransacao = UUID.randomUUID().toString();
            aprovado = true;
            System.out.println("Pagamento processado com sucesso. ID: " + idTransacao);
            return idTransacao;
        }
    }

    @Override
    public void estornar(String idTransacao) {
        if (aprovado) {
            aprovado = false;
            System.out.println("Estorno concluído. ID: " + idTransacao);
        } else {
            System.out.println("Não há pagamento aprovado para estornar.");
        }
    }
}
