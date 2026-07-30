public class Impressora{
    public static void main(String[] args){
        Documento [] filaDeImpressao = {
                new Relatorio("Vendas_Setembro.pdf"),
                new Foto("ferias_na_praia.jpg"),
                new Relatorio("Balancete_Atual.docx")
        };

        System.out.println("--- Iniciando Fila de Impressão ---");

        /*
        O polimorfismo acontece apartir daqui, para a impressora tudo é apenas um 'Documento'
        o comando 'imprimir()' e o proprio objeto (Relatorio ou Foto) se encarrega de executar a impressão
        de maneira correta
        */
        for(Documento doc: filaDeImpressao){
            doc.imprimir();
        }
    }
}
