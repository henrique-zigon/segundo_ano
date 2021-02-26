public class Index {
    public static void main(String[] args) {

        Professor profe=new Professor("Henrique",8.5,4.0);
        Coordenador coord=new Coordenador("Daniel",7.0,8.0);
        ControleBonus contr=new ControleBonus();

        contr.adicionarFunc(profe);
        contr.adicionarFunc(coord);

        contr.verObjetos();

        //não tem polimorfismo
        System.out.println("--------------------------------------EXERCICIO2------------------------\n");

        Professor1 profe1=new Professor1("Henrique1",8.5,4.0);
        Coordenador1 coord1=new Coordenador1("Daniel1",5.0,8.0,7.0,8.0);
        ControleBonus1 contr1=new ControleBonus1();

        contr1.adicionarFunc(profe1);
        contr1.adicionarFunc(coord1);

        contr1.verObjetos();


        //tem polimorfismo
    }
}
