import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private String nome;
    private char codEstacionamento;
    private List<Veiculo> veiculos;

    public Estacionamento(String nome, char codEstacionamento) {
        this.nome = nome;
        this.codEstacionamento = codEstacionamento;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() { return this.nome; }
    public char getCodEstacionamento() { return this.codEstacionamento; }

    public void showVeiculos() {
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(veiculo.getLocalEstacionado() + " - " + veiculo.getModelo());
        }
    }

    public void addVeiculo(Veiculo newVeiculo) {
        this.veiculos.add(newVeiculo);
        System.out.println("Veiculo adicionado à vaga com sucesso!!");
    }
}
