public class Caminhao extends Veiculo{
    String modelo, apelido;
    float velMax;

    public Caminhao (String modelo, String apelido){
        super(apelido, modelo);
        this.velMax = 100.00F;
    }

    @Override
    public void buzina() {
        System.out.println("PUM PUM!!");
    }
}
