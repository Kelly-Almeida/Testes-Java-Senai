public class Carro extends Veiculo {
    private int numPortas;

    public Carro (String marca, String modelo, int numPortas){
        super(marca, modelo);
        this.numPortas = numPortas;
    }

    public void abrirPortaMala(){
        System.out.println("Abrindo o porta malas do " + this.getNomeVeiculo());
    }
}
