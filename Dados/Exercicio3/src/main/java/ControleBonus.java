import java.util.ArrayList;
import java.util.List;

public class ControleBonus{
    private List<Funcionario> listaObjBonus=new ArrayList<Funcionario>();

    public ControleBonus() {
    }

    public void adicionarFunc(Funcionario funcVez){
        listaObjBonus.add(funcVez);
    }

    public void  verObjetos(){
        for (Funcionario funcVez : listaObjBonus){
            System.out.println(funcVez.toString());
        }
    }
}
