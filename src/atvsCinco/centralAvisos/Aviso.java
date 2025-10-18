package atvsCinco.centralAvisos;

public interface Aviso {
    void enviar(String mensagem, String destino);
    String status();
}
