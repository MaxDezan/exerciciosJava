package atvsCinco.exportarRelatorios;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ExportadorFactory {
    private static final Map<String, Supplier<ExportadorBase>> mapa = new HashMap<>();

    static {
        mapa.put("html", () -> new ExportadorHtml("Relatório", "29/11/2025", "Rodapé"));
        mapa.put("csv", () -> new ExportadorCsv("Relatório2", "29/11/2025", "Rodapé"));
        mapa.put("pdf", () -> new ExportadorPdf("Relatório3", "29/11/2025", "Rodapé"));

    }

    public static ExportadorBase criarExportador(String tipo) {
        Supplier<ExportadorBase> supplier = mapa.get(tipo.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Tipo de exportador desconhecido: " + tipo);
    }
}
