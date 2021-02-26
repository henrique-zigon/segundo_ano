public class TesteAluno {
    public static void main(String[] args) {

        AlunoFundamental aluninho=new AlunoFundamental(01,"pedro",8.6,5.9,8.5,7.5);
        AlunoGraduacao alunoJovem=new AlunoGraduacao(02,"thiago",9.5,7.75);
        AlunoPos alunao=new AlunoPos(03,"Joana",9.9,7.8,6.5);


        System.out.println(aluninho.toString());
        System.out.println(alunoJovem.toString());
        System.out.println(alunao.toString());


        Escola bandtec=new Escola("BandTec_digital_school");

        bandtec.adicionarAluno(alunoJovem);
        bandtec.adicionarAluno(alunao);

        System.out.println("ExibeTodos()---------------------");
        bandtec.exibeTodos();

        bandtec.exibeAlunoGraduacao();

        bandtec.exibeAprovados();

        bandtec.buscaAluno(02);
        bandtec.buscaAluno(30);

    }
}
