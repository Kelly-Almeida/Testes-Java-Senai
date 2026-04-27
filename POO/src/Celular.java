public class Celular {
    private int nivelBateria;

    public Celular(){
        this.nivelBateria = 50;
        System.out.println("Celular criado com " + this.nivelBateria + "% da bateria.");
    }

    public void carregar (int porcentagem){
        if(porcentagem > 0){
            this.nivelBateria += porcentagem;
            if (this.nivelBateria > 100){
                this.nivelBateria = 100;
            }
            System.out.println("Carregar... Nível atual: " + this.nivelBateria + "%");
        }
    }

    public  void usar(int porcentagem){
        if (porcentagem > 0){
            this.nivelBateria -= porcentagem;
            if (this.nivelBateria < 0){
                this.nivelBateria = 0;
            }
            System.out.println("Usando bateria... Nível atual: " + this.nivelBateria + "%");
        }
    }

    public int getNivelBateria(){
        return this.nivelBateria;
    }
}
