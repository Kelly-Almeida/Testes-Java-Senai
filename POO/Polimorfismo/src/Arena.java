public class Arena {
    public static void main(String[] args){
        Personagem[] herois = new Personagem[] {
            new Guerreiro("Conan"),
            new Mago("Gandalf"),
            new Arqueiro("Legolas")
        };
        Personagem monstro = new Personagem("Dragão", 200, 0){
            @Override
            public void usarHabilidade(Personagem alvo) {
                System.out.println("Dagrão não tem habilidade especiais.");
            }
        };
        System.out.println("======= A BATALHA VAI COMEÇAR! ========");
        monstro.receberDano(0);
        System.out.println("");

        for (Personagem heroi : herois){
            if ((monstro.estaVivo())){
                heroi.usarHabilidade(monstro);
                System.out.println("-----------------------------------------");
            }
        }
        System.out.println("\n========== FIM DA BATALHA ==========");
    }
}

