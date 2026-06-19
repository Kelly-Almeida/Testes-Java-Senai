public class Papaguaio extends Animal{
    private String raca, nome;
    private int idade;

    public Papaguaio(String raca, String nome, int idade){
        super(raca, nome, idade);
    }

    @Override
    public void som() {
        System.out.println("PIU PIU");
    }

    @Override
    public void mostrarNipe(){
        System.out.println("\n*" + setNome()+" vai até caixa de som*");
        System.out.println("Abra para ver: ");
        System.out.println("https://www.google.com/search?q=papagaio+dan%C3%A7ando&num=12&sca_esv=25bb37eb50603e0c&rlz=1C1GCEA_pt-BRBR1206BR1206&udm=39&biw=1920&bih=889&sxsrf=ANbL-n4T8RTqBvyQ_FR_pukluQL0APLTdQ%3A1781696971416&ei=y4kyauDrGPLm1sQPq-er0Ag&ved=0ahUKEwig_c-4mo6VAxVys5UCHavzCooQ4dUDCBM&uact=5&oq=papagaio+dan%C3%A7ando&gs_lp=Eh1nd3Mtd2l6LW1vZGVsZXNzLXNob3J0LXZpZGVvcyIScGFwYWdhaW8gZGFuw6dhbmRvMgYQABgHGB4yBRAAGIAEMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIFEAAYgAQyBRAAGIAEMgUQABiABEjtTVCSGVivSXAHeACQAQCYAWSgAfQIqgEEMTEuMbgBA8gBAPgBAZgCEqAC5AjCAgcQIxiwAhgnwgIFEAAY7wXCAg0QABiABBiKBRhDGLEDwgIKEAAYgAQYigUYQ8ICCBAAGAcYHhgKwgIIEAAYBxgeGBPCAgoQABgHGB4YExgKwgIHEAAYgAQYDcICBhAAGB4YDcICCBAAGB4YDRgKmAMA4gMFEgExIECIBgGSBwQxNC40oAfIVbIHAzcuNLgHyAjCBwYwLjcuMTHIBzuACAE&sclient=gws-wiz-modeless-short-videos#fpstate=ive&ip=1&vld=cid:eb19a6a2,vid:reyeJ1E5xho,st:0");
    }
}
