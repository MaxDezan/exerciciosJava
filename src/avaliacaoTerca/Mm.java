package avaliacaoTerca;

public class Mm {

    public static void main(String[] args) {
        Estado estado = new Estado("Manaus");
        Municipio municipio = new Municipio("Bla", estado);
        Endereco endereco = new Endereco("lala", 12, "la", "04284820", municipio);
        Cliente cliente = new Cliente("ola", 1999, endereco);
        System.out.println(cliente);
    }
}