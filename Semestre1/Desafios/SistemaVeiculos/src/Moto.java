public class Moto extends Veiculo{
    String modelo, apelido;
    float velMax;

    public Moto (String modelo, String apelido){
        super(apelido, modelo);
        this.velMax = 150.00F;
    }

    @Override
    public void buzina() {
        System.out.println("BI BI BI!!");
    }
}
