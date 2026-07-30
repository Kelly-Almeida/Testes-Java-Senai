public class Veiculo {
    private String placa;
    private String modelo;
    private char codEstacionamento;
    private int codVaga;

    public Veiculo(String placa, String modelo, char codEstacionamento, int codVaga) {
        if (placa != null && !placa.isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro ao cadastrar a placa");
            return;
        }

        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Erro ao cadastrar o modelo");
            return;
        }

        if (codEstacionamento != ' ') {
            this.codEstacionamento = codEstacionamento;
        } else {
            System.out.println("Erro ao encontrar código");
            return;
        }

        if (codVaga >= 0) {
            this.codVaga = codVaga;
        } else {
            System.out.println("Erro ao encontrar vaga");
            return;
        }
    }

    public String getPlaca() { return this.placa; }
    public String getModelo() { return this.modelo; }
    public char getCodEstacionamento() { return this.codEstacionamento; }
    public int getCodVaga() { return this.codVaga; }

    public String getLocalEstacionado() {
        return this.codEstacionamento + "" + this.codVaga;
    }
}
