import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Carrinho carrinho=new Carrinho();
        mostrarEscolhas();

        Integer sair=0;
        while (sair.equals(0)){
            Integer escolha=scanner.nextInt();
            switch (escolha){
                case 1:
                    Scanner scanCod=new Scanner(System.in);
                    System.out.println("digite o código do livro:");
                    Integer codLivro=scanCod.nextInt();
                    //-------------------------
                    Scanner scanPreCusto=new Scanner(System.in);
                    System.out.println("digite o pré custo do livro:");
                    Double preCusto=scanPreCusto.nextDouble();
                    //-------------------------
                    Scanner scanNome=new Scanner(System.in);
                    System.out.println("digite o nome do livro:");
                    String nomeLivro=scanNome.nextLine();
                    //-------------------------
                    Scanner scanAutor=new Scanner(System.in);
                    System.out.println("digite o nome do autor:");
                    String nomeAutor=scanAutor.nextLine();
                    //---------------------------
                    Scanner scanIsbn=new Scanner(System.in);
                    System.out.println("digite o isbn:");
                    String nomeIsbn=scanIsbn.nextLine();
                    //---------------------------
                    carrinho.adicionaVendavel(new Livro(codLivro,preCusto,nomeLivro,nomeAutor,nomeIsbn));
                    break;

                case 2:
                    Scanner scanCod1=new Scanner(System.in);
                    System.out.println("digite o código do dvd:");
                    Integer codDvd=scanCod1.nextInt();
                    //-------------------------
                    Scanner scanPreCusto1=new Scanner(System.in);
                    System.out.println("digite o pré custo do dvd:");
                    Double preCusto1=scanPreCusto1.nextDouble();
                    //-------------------------
                    Scanner scanNome1=new Scanner(System.in);
                    System.out.println("digite o nome do dvd:");
                    String nomeDvd=scanNome1.nextLine();
                    //-------------------------
                    Scanner scanGravadora=new Scanner(System.in);
                    System.out.println("digite o nome da gravadora:");
                    String gravadora=scanGravadora.nextLine();
                    //-------------------------
                    carrinho.adicionaVendavel(new DVD(codDvd,preCusto1,nomeDvd,gravadora));
                    break;
                case 3:
                    Scanner scanDescricao=new Scanner(System.in);
                    System.out.println("digite a descrição do serviço:");
                    String descricao=scanDescricao.nextLine();
                    //-------------------------
                    Scanner scanCod2=new Scanner(System.in);
                    System.out.println("digite o código do serviço:");
                    Integer codServico=scanCod2.nextInt();
                    //-------------------------
                    Scanner scanQntHr=new Scanner(System.in);
                    System.out.println("digite a quantidade de horas:");
                    Integer qntHr=scanQntHr.nextInt();
                    //-------------------------
                    Scanner scanValorHr=new Scanner(System.in);
                    System.out.println("digite o valor da hora:");
                    Double valorHr=scanValorHr.nextDouble();
                    //-------------------------
                    carrinho.adicionaVendavel(new Servico(descricao,codServico,qntHr,valorHr));
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println(carrinho.calculaTotalVenda());
                    break;
                case 6:
                    sair++;
                    break;
            }
            if (sair.equals(0)) {
                mostrarEscolhas();
            }
            escolha=0;
        }





    }
    public static void mostrarEscolhas(){
        System.out.println("escolha uma das opções a baixo: ");
        System.out.println("1.Adicionar livro \n" +
                "2.Adicionar DVD \n" +
                "3.Adicionar Servico \n" +
                "4.Exibir itens do carrinho \n" +
                "5.Exibir total de venda \n" +
                "6.Fim");
    }
}
