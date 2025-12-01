package atvsCinco.forYou;

public class Reels extends MidiaBase{
    public Reels(String titulo, String autor, String url, int segundos) {
        super(titulo, autor, url, segundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("Minerando nas minas de carvao um bom reel...");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
