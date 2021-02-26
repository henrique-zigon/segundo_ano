public class Perfume extends Produto{

    private String fragancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    @Override
    public Double getValorTributo() {
        return this.getPreco()*0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragancia='" + fragancia + '\'' +
                ", tributo='" + getValorTributo() + '\'' +
                "} " + super.toString();
    }
}
