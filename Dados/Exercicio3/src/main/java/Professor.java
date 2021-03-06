public class Professor implements Funcionario{
    public String nome;
    public Double qntAulasSemana;
    public Double valorHrAula;

    @Override
    public Double getValorBonus() {
        return this.qntAulasSemana*this.valorHrAula*4.5*0.15;
    }

    public Professor(String nome, Double qntAulasSemana, Double valorHrAula) {
        this.nome = nome;
        this.qntAulasSemana = qntAulasSemana;
        this.valorHrAula = valorHrAula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", qntAulasSemana=" + qntAulasSemana +
                ", valorHrAula=" + valorHrAula +
                ", getValorBonus" + getValorBonus() +
                '}';
    }
}
