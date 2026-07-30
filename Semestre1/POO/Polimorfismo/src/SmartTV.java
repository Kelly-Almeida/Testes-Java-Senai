public class SmartTV extends DispositivoDeMidia{
    private String filmeAtual;

    public SmartTV(String nome, String filme){
        super(nome);
        this.filmeAtual = filme;
    }

    @Override
    public void reproduzir(){
        System.out.println("A " + this.nomeDoDispositivo + " está reproduzindo o filme: '" + this.filmeAtual + "' EM 4K.");
    }
}
