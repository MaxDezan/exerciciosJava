package atvsDois.retangulo;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo (int largura, int altura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getLargura() {
        return largura;
    }
    public int getAltura() {
        return altura;
    }

    public void setLargura(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        int area = altura * largura;
        System.out.println("O valor da área é de " + area);
    }
    public void calcularPerimetro() {
        int perimetro = 2 * (altura + largura);
        System.out.println("O valor do perímetro é de " + perimetro);
    }
}
