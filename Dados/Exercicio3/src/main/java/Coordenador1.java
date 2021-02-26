public class Coordenador1 extends Funcionario1{
    public String nome;
    public Double qntAulasSemana;
    public Double valorHrAula;
    public Double qntCoorSemana;
    public Double valorHrCoor;

    public Coordenador1(String nome, Double qntAulasSemana, Double valorHrAula, Double qntCoorSemana, Double valorHrCoor) {
        this.nome = nome;
        this.qntAulasSemana = qntAulasSemana;
        this.valorHrAula = valorHrAula;
        this.qntCoorSemana = qntCoorSemana;
        this.valorHrCoor = valorHrCoor;
    }

    @Override
    public Double getValorBonus() {
        return this.qntCoorSemana*this.valorHrCoor*4.5*0.2+this.qntAulasSemana*this.valorHrAula*4.5*0.15;
    }


    @Override
    public String toString() {
        return "Coordenador1{" +
                "nome='" + nome + '\'' +
                ", qntAulasSemana=" + qntAulasSemana +
                ", valorHrAula=" + valorHrAula +
                ", qntCoorSemana=" + qntCoorSemana +
                ", valorHrCoor=" + valorHrCoor +
                ", getValorBonus=" + getValorBonus() +
                "} " + super.toString();
    }
}
