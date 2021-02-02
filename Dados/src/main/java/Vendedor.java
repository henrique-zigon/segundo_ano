public class Vendedor extends Funcionario {

    //atributo
    private Double vendas;
    private Double taxa;

    //construtor
    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }


    //métodos
    public Double calcSalario() {
        return vendas*taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                ", salário=" + calcSalario() +
                "} " + super.toString();
    }
}
