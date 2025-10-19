package atvsCinco.checkout;

public class Principall {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        PagCartao cartao = new PagCartao();
        checkout.realizarPagamento(cartao, 0);
        checkout.realizarEstorno(cartao, cartao.idTransacao);
        System.out.println("-----------------------------");

        PagPix pix = new PagPix();
        checkout.realizarPagamento(pix, 50);
        checkout.realizarEstorno(pix, pix.idTransacao);
        System.out.println("-----------------------------");

        PagBoleto boleto = new PagBoleto();
        checkout.realizarPagamento(boleto, 75);
        boleto.compensar(); // simula o pagamento "amanhã"
        checkout.realizarEstorno(boleto, boleto.idTransacao);
    }
}
