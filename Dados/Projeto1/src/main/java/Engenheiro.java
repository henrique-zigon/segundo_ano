public class Engenheiro extends Funcionario {

    //atributo
    private Double salario;

    //construtor

    public Engenheiro(String cpf, String nome, Double salarios) {
        super(cpf, nome);
        this.salario = salarios;
    }


    //métodos

    //implementação do método abstrato calcSalario()
    public Double calcSalario() {
        return salario;
    }

    //método toString()
    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                ", salário=" + calcSalario() +
                "} " + super.toString();
    }
}
