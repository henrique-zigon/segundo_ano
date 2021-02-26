import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> listaAlunos;

    public Escola(String nome) {
        this.nome = nome;
        this.listaAlunos=new ArrayList();
    }

    public void adicionarAluno(Aluno alunoAtual){
        listaAlunos.add(alunoAtual);
    }

    public void exibeTodos(){
        for(Aluno alunoAtual: this.listaAlunos){
            System.out.println(alunoAtual.toString());
        }
        System.out.println("--------------------------------------");
    }

    public void exibeAlunoGraduacao(){
        for (Aluno alunoAtual: this.listaAlunos){
            if (alunoAtual instanceof AlunoGraduacao){
                System.out.println(alunoAtual.toString());
            }
        }
        System.out.println("--------------------------------------");
    }

    public void exibeAprovados(){
        for (Aluno alunoAtual:this.listaAlunos){
            if(alunoAtual.calculaMedia()>=6){
                System.out.println(alunoAtual.toString());
            }
        }
        System.out.println("--------------------------------------");
    }

    public void buscaAluno(Integer ra) {
        System.out.println("-----------ENCONTRAR------------");
        Boolean encontrado = false;
        for (Aluno alunoAtual : this.listaAlunos) {
            if (alunoAtual.getRa() == ra) {
                System.out.println("Encontrado:" + alunoAtual.toString());
                encontrado = true;
            }
        }
        if (encontrado==Boolean.FALSE){
            System.out.println("Aluno Não Encontrado");
        }
    }
}
