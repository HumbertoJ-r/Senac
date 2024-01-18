package guibuilder;

import java.util.ArrayList;

public class ListasDePedidos {
    public static ArrayList<Pedido> lista = new ArrayList<Pedido>();
    
    public static void adicionar(Pedido p){
        
        //Execeções
        try {
            //Se tudo der certo
            //Validações 
        if{(p.getNomeCliente().isEmpty()|| p.getNomeCliente().isBlank()
                ||p.getPreco()<=0 || p.getQuantidade()<=0 || p.getAcompanhamento().isBlank() 
                ||p.getAcompanhamento().isEmpty() || p.getAdicional().isBlank() 
                || p.getAdicional().isEmpty());
                    System.out.println("Produto possui um campo inváido");
        }else {
                lista.add(p);
                System.out.println("Pedido adicionado com sucesso!");
                }
        }catch (Exception e){
                        //Se tudo der errado
                        System.out.println("Não foi possível adicionar o pedido");
                        }
    }
}
