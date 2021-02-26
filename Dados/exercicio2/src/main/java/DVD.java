public class DVD extends Produto{
    private String nome;
    private String gravadora;


    public DVD(int codigo, double preCusto, String nome, String gravadora) {
        super(codigo, preCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", valor de venda='" + getValorVenda() + '\'' +
                "} " + super.toString();
    }
    //-----------------------------------------------------------------------

    @Override
    public Double getValorVenda() {
        return getPreCusto()+(getPreCusto()*0.2);
    }
}
