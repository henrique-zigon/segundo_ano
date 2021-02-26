import java.util.ArrayList;
import java.util.List;

public class ControleBonus1 {


        private List<Funcionario1> listaObjBonus1=new ArrayList<Funcionario1>();

        public ControleBonus1() {
        }

        public void adicionarFunc(Funcionario1 funcVez){
            listaObjBonus1.add(funcVez);
        }

        public void  verObjetos(){
            for (Funcionario1 funcVez : listaObjBonus1){
                System.out.println(funcVez.toString());
            }
        }


}
