package ap2Terca;

public class NotificacaoEmail extends MensagemBase{

    public NotificacaoEmail(String destino, String conteudo) {
        super(destino, conteudo);
    }

    @Override
    public void enviar() {
        System.out.println("[E-mail] Enfileirando no provedor SMTP…");
    }

    @Override
    public int tempoEstimadoSeg() {
        if (conteudo.length() <= 100) {
            return 3;
        } else if (conteudo.length() <= 300) {
            return 5;
        }else {
            return 8;
        }
    }
    @Override
    public double custoTotal() {
        if (tempoEstimadoSeg() == 3){
            return 3;
        } else if (tempoEstimadoSeg() == 5) {
            return 5;
        }else
        return 5 + (conteudo.length() * 0.01);
    }
}
