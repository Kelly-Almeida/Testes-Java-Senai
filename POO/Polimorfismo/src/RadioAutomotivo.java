import java.security.PublicKey;

public class RadioAutomotivo extends DispositivoDeMidia{
    private double estacaoAtualFM;

    public RadioAutomotivo(String nome, double estacao){
        super(nome);
        this.estacaoAtualFM = estacao;

    }

    @Override
    public void reproduzir(){
        System.out.println("O " + this.nomeDoDispositivo + " está sintonizadi na estação de rádio FM " + this.estacaoAtualFM + " .");
    }
}
