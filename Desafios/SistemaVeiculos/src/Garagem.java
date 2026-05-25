import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private String nome;
    List <Veiculo> veiculos = new ArrayList<>();

    public Garagem(String nome, float tamanho){
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;
    }

    public void getVeiculo(Veiculo veiculos){
        if (this.veiculos.isEmpty()){
            System.out.println("Não há nenhum carro nesse local");
        }else{
            System.out.println("Na garagem tem: ");
            for (Object veiculo : this.veiculos) {
                System.out.println(" " + veiculo);
            }
        }

    }

    public void addVeiculo(Object veiculo){
        this.veiculos.add((Veiculo) veiculo);
        System.out.println("Veiculo adicionado!! ");
    }

}
