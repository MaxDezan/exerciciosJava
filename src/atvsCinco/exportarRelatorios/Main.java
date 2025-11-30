package atvsCinco.exportarRelatorios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Exportar> exportadores = new ArrayList<>();
        exportadores.add(ExportadorFactory.criarExportador("html"));
        exportadores.add(ExportadorFactory.criarExportador("csv"));
        exportadores.add(ExportadorFactory.criarExportador("pdf"));

        String dados = "esses sao meus dados oi";

        for (Exportar e : exportadores) {
            System.out.println(e.exportar(dados, "relatório salvo"));
        }
    }

}
