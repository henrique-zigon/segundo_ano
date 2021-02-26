public class TesteAtributo {

    public static void main(String[] args) {

        Alimento maca=new Alimento(123,"Maça Fuji",6.99,3);
        Perfume purovoodoo=new Perfume(456,"Perfume da Rochele",200.0,"amadeirado");
        Servico dev=new Servico("desenvolvedor freelancer",1000.0);

        System.out.println(maca);
        System.out.println(purovoodoo);
        System.out.println(dev);


        Tributo trib=new Tributo();


        trib.adicionaTributavel(maca);
        trib.adicionaTributavel(purovoodoo);
        trib.adicionaTributavel(dev);


        trib.exibeTodos();

        System.out.println("\nTotal de tributos: "+trib.calculaTotalTributo());

        Double total=trib.calculaTotalTributo();

    }
}
