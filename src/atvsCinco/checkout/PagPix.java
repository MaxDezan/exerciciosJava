package atvsCinco.checkout;

public class PagPix extends PagBase {

    @Override
    public String processar(float valor) {
        System.out.println("Pagamento via PIX: R$ " + valor);
        return super.processar(valor);
    }
}
