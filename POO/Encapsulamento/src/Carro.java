public class Carro {
    private boolean ligado;
    private float velocidade;
    private int marcha;

    public Carro(){
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;

        System.out.println("Carrinho desligado e parado criado com sucesso");
    }

    public void ligar(){
        if(this.ligado){
            System.out.println("O carro já está ligado.");
        }else {
            this.ligado = true;
            System.out.println("Fusquinha ligado!!!");
        }
    }

    public void acelerar(float vel){
        if(this.ligado && vel > 0){
            this.velocidade += vel;
        } else {
            System.out.println("O carro está desligado ou o valor é inválido!!");
        }
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    public void frear(float desA){
        if(ligado && this.velocidade > 0 && desA > 0){
            this.velocidade -=  desA;

            if(this.velocidade < 0){
                this.velocidade = 0;
            }
        } else{
            System.out.println("O carro está parado!!");
            atualizarMarcha();
        }
    }
    private void atualizarMarcha(){
        if (this.velocidade == 0) this.marcha = 0;
        else if(this.velocidade < 20) this.marcha = 1;
        else if (this.velocidade < 40) this.marcha = 2;
        else this.marcha = 3;
        System.out.println("--> Marcha atual: " + this.marcha);
    }
    public void desligar(){
        if(!ligado){
            System.out.println("O carro já está desligado!!");
        } else if (this.velocidade == 0){
            this.ligado = false;
            System.out.println("Carrinho desligado com sucesso!!");
        } else {
            System.out.println("O carro está em movimento! Desacelere antes de desligar");
        }
    }
}
