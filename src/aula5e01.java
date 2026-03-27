class aula5e01 {
    public static void main(String[] args) {
        String[] cores = new String[]{"Azul", "Vermelho", "Preto", "Laranja", "Verde"};
        System.out.println("A primeira cor é " + cores[0]);
        System.out.println("A última cor é " + cores[4]);
        System.out.println("\n--- Lista de cores ---\n");

        for(int i = 0; i < cores.length; ++i) {
            System.out.println("*" + cores[i] + ", posição " + i);
        }

    }
}
