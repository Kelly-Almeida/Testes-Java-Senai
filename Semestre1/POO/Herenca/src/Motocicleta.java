public class Motocicleta extends Veiculo{
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void empinar(){
        System.out.println(this.getNomeVeiculo() + " tomara que caia");
    }
}
