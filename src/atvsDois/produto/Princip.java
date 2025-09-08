package atvsDois.produto;

import java.math.BigDecimal;

public class Princip {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", new BigDecimal("49.90"), 5);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço unitário R$" + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Total " + produto.getTotalFormatado());
    }
}
