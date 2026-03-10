import java.util.ArrayList;

public class ListaNomefiltrados {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Rodrigues");
        nomes.add("Antonio");
        nomes.add("Carlos");
        nomes.add("Juliana");
        nomes.add("Amanda");

        FiltroNome filtroLetraA = (nome) -> nome.startsWith("A");

        System.out.println("Nomes que começam com a letra A:");

        nomes.stream()
                .filter(nome -> filtroLetraA.testar(nome))
                .forEach(nome -> System.out.println(nome));
    }
}