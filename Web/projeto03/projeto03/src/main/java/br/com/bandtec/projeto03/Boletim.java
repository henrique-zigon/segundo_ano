package br.com.bandtec.projeto03;

public class Boletim {

    private String aluno;
    private Double nota1;
    private Double nota2;


    public Boletim(String aluno, Double nota1, Double nota2) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

// A criação dos arrays e das lista são baseadas nos getters e setters, se não tiver, ele não cria automaticamente
// os arrays e lista não são criados baseados nos atributos da classe, mas sim dos getters e setter
    public String getAluno() {
        return aluno;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getMedia(){
        return (this.nota1+this.nota2)/2;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Boolean isAprovado(){
        return this.getMedia()>=6;
    }

}
