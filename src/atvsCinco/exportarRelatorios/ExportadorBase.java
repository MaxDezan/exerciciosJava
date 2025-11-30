package atvsCinco.exportarRelatorios;

public abstract class ExportadorBase implements Exportar {
    protected String titulo;
    protected String data;
    protected String rodape;

    public ExportadorBase(String titulo, String data, String rodape) {
        this.titulo = titulo;
        this.data = data;
        this.rodape = rodape;
    }

    protected abstract String gerarCorpo(String dados);

     protected String montarArquivoCompleto(String dados) {
        return formatarCabecalho() + gerarCorpo(dados) + formatarRodape();
    }

    protected String formatarCabecalho() {
        return titulo + " | " + data + "\n";
    }

    protected String formatarRodape() {
        return rodape + "\n";
    }
}
