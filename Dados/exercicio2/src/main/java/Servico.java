public class Servico implements Vendavel{
    private String descricao;
    private int codigo;
    private int quantHora;
    private double valorHora;

    public Servico(String descricao, int codigo, int quantHora, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHora = quantHora;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantHora() {
        return quantHora;
    }

    public void setQuantHora(int quantHora) {
        this.quantHora = quantHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", quantHora=" + quantHora +
                ", valorHora=" + valorHora +
                ", valor de venda=" + getValorVenda() +
                '}';
    }
    //------------------------------------------------------------------

    @Override
    public Double getValorVenda() {
        return this.valorHora*this.quantHora;
    }
}
