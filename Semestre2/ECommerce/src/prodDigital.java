package src;

import src.produto;

public class prodDigital extends produto {

    private String canalEnv;

    public prodDigital(String nome, float valor, String canalEnv){
        super(nome, valor);
        this.canalEnv = canalEnv;
    }

    public String getCanalEnv() {
        return canalEnv;
    }

    public void setCanalEnv(String canalEnv) {
        this.canalEnv = canalEnv;
    }
}