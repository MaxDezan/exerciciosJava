package ap2Terca;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Notificavel> fila = new ArrayList<>();

        fila.add(new NotificacaoEmail("saraiva@professor.com", "oi!"));
        fila.add(new NotificacaoSms("+55 11 99999-8888", "esse não é o numero do saraiva"));
        fila.add(new NotificacaoEmail("sa@raiva.com", "saraiva me lembra a livraria grande que faliu aaaaaaaaa esta mensagem tem que ser mais longa pra testar aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

        boolean menorTempo = true;

        while (menorTempo) {
            menorTempo = false;
            for (int i = 0; i < fila.size() - 1; i++) {
                Notificavel mensagemAtual = fila.get(i);
                Notificavel proximaMensagem = fila.get(i + 1);

                if (mensagemAtual.tempoEstimadoSeg() > proximaMensagem.tempoEstimadoSeg()) {
                    fila.set(i, proximaMensagem);
                    fila.set(i + 1, mensagemAtual);
                    menorTempo = true;
                }
            }
        }

        for (Notificavel n : fila) {
            System.out.println(n);
            System.out.println("Tempo: " + n.tempoEstimadoSeg() + "s | Custo: R$" + n.custoTotal());
            n.enviar();
            System.out.println();
        }
    }
}