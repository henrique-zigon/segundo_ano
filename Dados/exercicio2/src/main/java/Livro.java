public class Livro extends Produto{
    private String nome;
    private String autor;
    private String isbn;

    public Livro(int codigo, double preCusto, String nome, String autor, String isbn) {
        super(codigo, preCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", valor de venda='" + getValorVenda() + '\'' +
                "} " + super.toString();
    }
    //-----------------------------------------------------------------


    @Override
    public Double getValorVenda() {
        return getPreCusto()+(getPreCusto()*0.1);
    }
}
