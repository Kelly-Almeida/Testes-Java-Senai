public class Relatorio extends Documento{
    public Relatorio(String nome){super(nome);}

    @Override
    public void imprimir(){
        System.out.println("Imprimindo o RELATÓRIO: '" + nome + "' com cabeçalho e rodapé.");
    }
}
