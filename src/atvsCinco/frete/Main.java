package atvsCinco.frete;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double peso = 15;
        String cep = "8  1012345";

        List<CalcularFrete> opcoes = new ArrayList<>();
        opcoes.add(new FreteMotoboy());
        opcoes.add(new FreteCorreios());
        opcoes.add(new FreteRetirada());

        CalcularFrete maisBarato = null;
        CalcularFrete maisRapido = null;
        double menorValor = Double.MAX_VALUE;
        int menorPrazo = Integer.MAX_VALUE;

        for (CalcularFrete frete : opcoes) {
            double valor = frete.valor(peso, cep);
            int prazo = frete.prazo(cep);
            if (valor <= 0) continue;

            if (valor < menorValor) {
                menorValor = valor;
                maisBarato = frete;
            }

            if (prazo < menorPrazo) {
                menorPrazo = prazo;
                maisRapido = frete;
            }
        }

        System.out.println("Mais barato: " + (maisBarato != null ? maisBarato.getClass().getSimpleName() + " - R$" + menorValor : "Nenhum"));
        System.out.println("Mais rápido: " + (maisRapido != null ? maisRapido.getClass().getSimpleName() + " - " + menorPrazo + " dias" : "Nenhum"));
    }
}
