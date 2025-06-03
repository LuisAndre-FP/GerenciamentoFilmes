import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalago catalago = new Catalago();

        Scanner scanner = new Scanner(System.in);

        boolean menu = true;
        int op = 0;
        do {
            System.out.println("1 -> adicionar filme");
            System.out.println("2 -> listar filmes");
            System.out.println("3 -> buscar filme por titulo");
            System.out.println("4 -> buscar filme por categoria");
            System.out.println("0 -> sair");
            op = scanner.nextInt();
            switch (op){
                case 1 -> catalago.adicionarFilme();
                case 2 -> catalago.listaFilme();
                case 3 -> catalago.buscarTitulo();
                case 4 -> catalago.buscarCategoria();
                case 0 -> menu = false;
            }

        }
        while (menu);




        }
    }
