package ap2Terca;

public class NotificacaoSms extends MensagemBase{
    public NotificacaoSms(String destino, String conteudo) {
        super(destino, conteudo);
    }

    @Override
    public void enviar() {
        System.out.println("[SMS] Mensagem enviada via gateway…");
    }

    @Override
    public int tempoEstimadoSeg() {
        if (conteudo.length() <= 50) {
            return 2;
        } else if (conteudo.length() <= 100) {
            return 3;
        }else {
            return 5;
        }
    }

    @Override
    public double custoTotal() {
        if (tempoEstimadoSeg() == 2){
            return 1;
        } else if (tempoEstimadoSeg() == 3) {
            return 2;
        }else
            return 2 + (conteudo.length() * 0.02);
    }
}
