package src;



public class prodFisico extends produto {

    private float frete;

    public prodFisico(String nome, float valor, float frete){
        super(nome, valor);
        this.frete = frete;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }
}