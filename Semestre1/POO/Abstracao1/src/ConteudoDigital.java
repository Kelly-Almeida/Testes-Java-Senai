public abstract class ConteudoDigital {
    protected String titulo;
    protected  Usuario autor;

    public ConteudoDigital(String titulo, Usuario autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void exibir();
    public abstract String getTipo();

    public String getInformacaoAutor(){
        return "Criando por: " + autor.getNomeDeUsuario() + " (" + autor.getEmail() + ") ";
    }

}
