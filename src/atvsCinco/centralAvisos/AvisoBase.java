package atvsCinco.centralAvisos;

public class AvisoBase implements Aviso {
    protected boolean enviado;
    protected String tipo;

    public AvisoBase(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void enviar(String mensagem, String destino) {
        if (mensagem == null || mensagem.isEmpty() || destino == null || destino.isEmpty()) {
            this.enviado = false;
            System.out.println("Falha ao enviar (" + tipo + "): destino ou mensagem inválidos.");
        }else{
            System.out.println("Enviando " + tipo + " para " + destino + ": " + mensagem);
            this.enviado = true;
        }
    }

    @Override
    public String status() {
            return enviado ? tipo + "Status: Enviado com sucesso!" : "Status: Mensagem não enviada (" + tipo + ")";
        }
}
