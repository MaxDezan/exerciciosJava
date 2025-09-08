package atvsDois.produto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
    private String nome;
    private BigDecimal preco;
    private int quantidade;

    public Produto(String nome, BigDecimal preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return preco.multiply(BigDecimal.valueOf(quantidade));
    }

    public String getTotalFormatado() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatoMoeda.format(getTotal());
    }
}
