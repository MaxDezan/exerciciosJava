package atvsCinco.forYou;

public abstract class MidiaBase implements Midia{
    String titulo;
    String autor;
    String url;
    int segundos;

    public MidiaBase(String titulo, String autor, String url, int segundos) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
        this.segundos = segundos;
    }

    @Override
    public int duracao() {
        return segundos;
    }

    @Override
    public String toString() {
        return String.format( this.getClass().getSimpleName() + " | Reproduzindo agora: %s, de %s | %s", titulo, autor, url);
    }
}
