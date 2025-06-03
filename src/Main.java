public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("xxxxx","sssssss", "sjdjdss", 2020);
        Catalago catalago = new Catalago();
        catalago.adicionarFilme(filme);
        catalago.listaFilme();
        catalago.buscarCategoria("terror");


        }
    }
