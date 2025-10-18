package atvsCinco.centralAvisos;

public class AvisoBase implements Aviso {
    protected boolean falhou;
    protected String tipo;

    public AvisoBase(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void enviar(String mensagem, String destino) {
        if (mensagem == null || mensagem.isEmpty() || destino == null || destino.isEmpty()) {
            this.falhou = true;
            System.out.println("Falha ao enviar (" + tipo + "): destino ou mensagem inválidos.");
        } else {
            this.falhou = false;
            System.out.println("Enviando " + tipo + " para " + destino + ": " + mensagem);
        }
    }

    @Override
    public String status() {
        if (falhou) {
            return "❌ Falha ao enviar (" + tipo + ")";
        } else {
            return "✅ Enviado com sucesso (" + tipo + ")";
        }
    }
}
