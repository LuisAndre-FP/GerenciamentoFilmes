public class Filme {
    private String nome;
    private String categoria;
    private String diretor;
    private int anoDeLancamento;

    public Filme (String nome, String categoria, String diretor, int anoDeLancamento){
        this.nome = nome;
        this.categoria = categoria;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void mostrarFilme(){
        System.out.println("Titulo: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
    }


}
