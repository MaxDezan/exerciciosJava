package atvsCinco.forYou;

public class Podcast extends MidiaBase{
    public Podcast(String titulo, String autor, String url, int segundos) {
        super(titulo, autor, url, segundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("Espero que nao seja corte do flow...");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
