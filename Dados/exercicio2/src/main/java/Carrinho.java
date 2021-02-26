import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> cart=new ArrayList<Vendavel>();

    public void adicionaVendavel(Vendavel v){
        this.cart.add(v);
    }

    public Double calculaTotalVenda(){
        Double totalzao=0.0;
        for(Vendavel vVez : cart){
            totalzao=totalzao+vVez.getValorVenda();
        }
        return totalzao;
    }

    public void exibeItensCarrinho(){
        for (Vendavel vVez : cart){
            System.out.println(vVez.toString());
        }
    }
}
