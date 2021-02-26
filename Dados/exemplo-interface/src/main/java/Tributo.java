import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> lista;

    public Tributo(){
        lista=new ArrayList<Tributavel>();
    }

    public void adicionaTributavel(Tributavel t){
        lista.add(t);
    }

    public void exibeTodos(){
        System.out.println("\nLista de objetos tributáveis:");
        for (Tributavel t : lista){
            System.out.println(t);
        }
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;
        for (Tributavel t:lista){
            total+=t.getValorTributo();
        }
        return total;
    }
}
