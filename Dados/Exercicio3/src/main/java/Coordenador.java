public class Coordenador implements Funcionario{
    public String nome;
    public Double qntCoorSemana;
    public Double valorHrCoor;

    @Override
    public Double getValorBonus() {
        return this.qntCoorSemana*this.valorHrCoor*4.5*0.2;
    }

    public Coordenador(String nome, Double qntCoorSemana, Double valorHrCoor) {
        this.nome = nome;
        this.qntCoorSemana = qntCoorSemana;
        this.valorHrCoor = valorHrCoor;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", qntCoorSemana=" + qntCoorSemana +
                ", valorHrCoor=" + valorHrCoor +
                ", getValorBonus=" + getValorBonus() +
                '}';
    }
}
