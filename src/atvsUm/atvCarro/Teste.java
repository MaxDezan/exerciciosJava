package atvsUm.atvCarro;

public class Teste {
    public static void main(String[] args) {
        Dono dono = new Dono("Max", "05774963012");
        Carro carro = new Carro("Chevrolet", 1970, "Chevette", dono);
        System.out.println("Olá " + dono.getNome() + " CPF: " + dono.getCpf() + ", Seu carro é \n");
        System.out.println(carro.getMarca() + ", " + carro.getModelo() + ", " + carro.getAno());
    }
}
