import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List <Produto> pedido = new ArrayList<>();
    private int idPedido;

    public Pedido( int idPedido){
        this.idPedido = idPedido;
    }

    public int getIdPedido(){
        return this.idPedido;
    }

    public void getItens(){

        if(this.pedido == null) {
            int i = 0;
            for (Produto produto : this.pedido) {
                System.out.println(i + " " + produto.getNome() + " " + produto.getValor());
            }
        }else{
            System.out.println("Adicione um produto ao pedido!!");
        }

    }

    public void addItem(Produto p){
        if (p != null){
            pedido.add(p);
            System.out.println(p.getNome() + " adicionado ao pedido!!");
        }else{
            System.out.println("Pedido inválido!!");
        }
    }

    public  float total(){
        float total = 0;
        if (this.pedido != null){
            for (Produto p : this.pedido) {
                total += p.getValor();
            }
        }else {
            total = 0;
        }
        return total;
    }
}
