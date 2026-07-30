public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar(){
        System.out.println("Ligando " + getNomeVeiculo());
    }

    protected String getNomeVeiculo(){
        return this.marca + " " + this.modelo;
    }

    public void desligar(){
        System.out.println("Desligando " + getNomeVeiculo());
    }
}
