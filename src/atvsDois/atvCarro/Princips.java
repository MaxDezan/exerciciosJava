package atvsDois.atvCarro;

public class Princips {
    public static void main(String[] args) {
        Dono dono = new Dono("Max", "05794963016");
        Carro carro = new Carro("Chevrolet", 1970, "Chevette", dono);
        System.out.println("Olá " + dono.getNome() + " CPF: " + dono.getCpf() + ", Seu carro é \n");
        System.out.println(carro.getMarca() + ", " + carro.getModelo() + ", " + carro.getAno());
    }
}
