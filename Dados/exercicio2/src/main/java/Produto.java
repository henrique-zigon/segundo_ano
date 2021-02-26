public abstract class Produto implements Vendavel{
    private int codigo;
    private double preCusto;


    public Produto(int codigo, double preCusto) {
        this.codigo = codigo;
        this.preCusto = preCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreCusto() {
        return preCusto;
    }

    public void setPreCusto(double preCusto) {
        this.preCusto = preCusto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", preCusto=" + preCusto +
                '}';
    }
}
