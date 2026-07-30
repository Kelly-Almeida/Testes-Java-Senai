public class Celular extends DispositivoDeMidia {

    private String musicaAtual;
    private String artista;

    public Celular(String nome, String musica, String artista){
        //Chamando o construtor da classe mãe
        super(nome);
        this.musicaAtual = musica;
        this.artista = artista;
    }

    //sobreescrever o metodo que herdou da classe mae
    @Override
    public void reproduzir(){
        System.out.println("O " +this.nomeDoDispositivo + " está tocando a música '" + this.musicaAtual + "' de " + this.artista + " .");
    }
}
