import java.util.ArrayList;

public class Catalago {
    private ArrayList<Filme> catalago = new ArrayList<>();


    public void adicionarFilme(Filme filme) {
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

        public void buscarTitulo (String nome){
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

        public void buscarCategoria(String categoria){
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
