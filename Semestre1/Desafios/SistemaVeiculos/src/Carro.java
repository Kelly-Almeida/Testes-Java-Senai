public class Carro extends Veiculo{
    String modelo, apelido;
    float velMax;

    public Carro (String modelo, String apelido){
        super(apelido, modelo);
        this.velMax = 200.00F;
    }

    @Override
    public void buzina() {
        System.out.println("BIBI!!");
    }


}
