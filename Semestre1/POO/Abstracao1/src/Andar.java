public class Andar extends Acao{
    private int passos;
    public Andar (int passos){this.passos = passos;}

    @Override
    public void executar() {
        System.out.println("Andar para frente por " + passos + " passos.");
    }
}
