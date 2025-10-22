package ap2Terca;

import java.util.UUID;

public abstract class MensagemBase implements Notificavel {
    protected String id = UUID.randomUUID().toString().substring(0, 8);
    protected String destino;
    protected String conteudo;

    public MensagemBase(String id, String destino, String conteudo) {
        this.id = id;
        this.destino = destino;
        this.conteudo = conteudo;
    }

    public MensagemBase(String destino, String conteudo) {
        this.destino = destino;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "<" + id + ">" + " -> " + "<" + destino + ">" + " | '" + "<" + conteudo + ">" + "'";
    }

}
