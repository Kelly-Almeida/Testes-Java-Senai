public abstract class Veiculo {
    private String apelido, modelo;
    float velMax;

    public Veiculo(String apelido, String modelo){
        this.apelido = apelido;
        this.modelo = modelo;
        this.velMax = 0;
    }

    public abstract void buzina();
    public String setApelido(){
        return this.apelido;
    }

    public String setModelo(){
        return this.modelo;
    }
    public float setVelMax(){
        return this.velMax;
    }
}
