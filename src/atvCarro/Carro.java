package atvCarro;

public class Carro {
    private String marca;
    private int ano;
    private String modelo;
    private Dono dono;

    public Carro(String marca, int ano, String modelo, Dono dono) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.dono = dono;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

}
