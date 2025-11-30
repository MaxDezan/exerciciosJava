package atvsCinco.exportarRelatorios;

public class ExportadorPdf extends ExportadorBase {
    public ExportadorPdf(String titulo, String data, String rodape) {
        super(titulo, data, rodape);
    }

    @Override
    protected String gerarCorpo(String dados) {
        return dados + "\n";
    }

    @Override
    protected String formatarRodape() {
        return "_______________\n" + rodape;
    }

    @Override
    public String exportar(String dados, String destino) {
        return montarArquivoCompleto(dados);
    }
}
