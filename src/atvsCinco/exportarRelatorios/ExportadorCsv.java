package atvsCinco.exportarRelatorios;

public class ExportadorCsv extends ExportadorBase {

    public ExportadorCsv(String titulo, String data, String rodape) {
        super(titulo, data, rodape);
    }

    @Override
    protected String formatarCabecalho() {
        return titulo + ", " + data + "\n";
    }

    @Override
    protected String gerarCorpo(String dados) {
        return dados.replace(" ", ",\n") + "\n";
    }

    @Override
    public String exportar(String dados, String destino) {
        return montarArquivoCompleto(dados);
    }
}

