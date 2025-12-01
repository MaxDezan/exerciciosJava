package atvsCinco.forYou;

public class Tiktok extends MidiaBase{
    public Tiktok(String titulo, String autor, String url, int segundos) {
        super(titulo, autor, url, segundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reza ai pra nao ser um ad generico do tiktok shop...");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
