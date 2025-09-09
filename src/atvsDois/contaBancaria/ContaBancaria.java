package atvsDois.contaBancaria;

import java.math.BigDecimal;

public class ContaBancaria {
    private int numero;
    private String titular;
    private BigDecimal saldo;

    public ContaBancaria(int numero, String titular, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor.compareTo(saldo) > 0) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo = saldo.subtract(valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta (" + titular + "): R$" + saldo);
    }
}
