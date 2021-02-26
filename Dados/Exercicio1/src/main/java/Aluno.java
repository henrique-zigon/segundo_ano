public abstract class Aluno {
    private Integer ra;
    private String nome;

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                '}';
    }
}
