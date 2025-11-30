package atvsCinco.exportarRelatorios;

public class ExportadorHtml extends ExportadorBase {

    public ExportadorHtml(String titulo, String data, String rodape) {
        super(titulo, data, rodape);
    }
    @Override
    protected String formatarCabecalho() {
        return String.format("<h1>" + titulo + "</h1> <h2>" + data + "</h2>\n");
    }

    @Override
    protected String gerarCorpo(String dados) {
        return "<p>" + dados + "</p>\n";
    }

    @Override
    protected String formatarRodape() {
        return "<p>" + rodape + "</p>\n";
    }

    @Override
    public String exportar(String dados, String destino) {
        return montarArquivoCompleto(dados);
    }
}


