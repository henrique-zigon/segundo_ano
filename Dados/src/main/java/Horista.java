public class Horista extends Funcionario {

    //atributos
    private Integer qtdHora;
    private Double valorHora;

    //construtor
    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    //métodos
    public Double calcSalario() {
        return qtdHora*valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + valorHora +
                ", salário=" + calcSalario() +
                "} " + super.toString();
    }
}
