import java.util.ArrayList;
import java.util.Scanner;

public class Catalago {
    private ArrayList<Filme> catalago = new ArrayList<>();
Scanner scanner = new Scanner(System.in);

    public void adicionarFilme(){
        System.out.println("Digite o titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite categoria: ");
        String categoria = scanner.nextLine();

        System.out.println("Digite o diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = scanner.nextInt();

        Filme filme = new Filme(titulo, categoria, diretor, anoDeLancamento);

        for (Filme f : catalago) {
            if (f.getNome().equalsIgnoreCase(filme.getNome())) {
                System.out.println("Já existe o filme");
                return;
            }
        }
        catalago.add(filme);
        System.out.println("Filme adicionado com sucesso!");
    }

        public void listaFilme () {
            if (catalago.isEmpty()) {
                System.out.println("Está vazio");
                return;
            }
            for (Filme f : catalago) {
                f.mostrarFilme();
            }

        }

        public void buscarTitulo (){
            System.out.println("Digite o nome do filme: ");
            String nome = scanner.nextLine();
        boolean existe = false;
        for (Filme f : catalago){
            if (f.getNome().equalsIgnoreCase(nome)){
                f.mostrarFilme();
                existe = true;
            }
        }
        if (!existe){
            System.out.println("não existe esse filme");
        }

        }

        public void buscarCategoria(){
            System.out.println("Digite a categoria: ");
            String categoria = scanner.nextLine();

        boolean existe = false;
        for (Filme f: catalago){
            if (f.getCategoria().equalsIgnoreCase(categoria)){
                f.mostrarFilme();
                existe = true;
            }
        }
        if (!existe){
            System.out.println("não existe filme com essa categoria ");
        }

        }




}
