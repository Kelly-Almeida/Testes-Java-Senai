package src;

import src.produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<produto> carrinho;

    public Carrinho (){
        this.carrinho = new ArrayList<>();
    }

    public void addItem(produto prod){
        carrinho.add(prod);
        System.out.println("Produto adicionado!!");
    }

    public int carrinhoSize(){
        return this.carrinho.size();
    }

    public void itensCarrinho(){
        carrinho.forEach(c -> {
            System.out.println(c.getNome() + " - R$ " + c.getValor());
        });
    }

    public float valorCarrinho(){
        float valorTotal = 0;
        for (produto p : this.carrinho){
            valorTotal += p.getValor();
        }

        return valorTotal;
    }
}
