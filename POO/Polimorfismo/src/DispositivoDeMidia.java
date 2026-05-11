public  abstract class DispositivoDeMidia {
    //Classe abstrada que molda sua filhas, assim criando uma forma de diretrises obrigatórias para suas filhas e polimorfas

    protected String nomeDoDispositivo;

    public DispositivoDeMidia(String nome){
        this.nomeDoDispositivo = nome;
    }

    /*Este é um metodo abstrato. Ele não tem implementação (sme {}).
    Ele FORÇA todas classes filhas a criarem sua própria versão
    do metodo 'reproduzier()', Este é o nosso "Botão Play" conceitual*/
    public abstract void reproduzir();

        //Classes abstratas também podem ter metodo concretos (com implementação), que serão herdados normalmente por todas as filhas
        public void desligar(){
            System.out.println(this.nomeDoDispositivo + " está desligando.");
        }
}
