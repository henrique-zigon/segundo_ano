public abstract class Funcionario {

    //atributos
    private String cpf;
    private String nome;

    //construtor
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //métodos
    //metodo abstrato toString
    public abstract Double calcSalario();
    //metodo toString()     Sobre-escrita de método
    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
