/*Usuario
Adicionar: atributo de quantos livros o usuário alugou */
public class Usuario {
    private int id;
    private float saldoMultas;
    private String nome, email;

    public Usuario(int id, float saldoMulta, String nome, String email){
        this.id = id;
        this.saldoMultas = saldoMulta;
        this.nome = nome;
        this.email = email;
    }

    /*Metodos de leitura*/
    public int getId(){
        return this.id;
    }

    public float getSaldoMultas(){
        return this.saldoMultas;
    }

    public String getNome(){
        return this.nome;
    }

    public String email(){
        return this.email;
    }

    /*Metodos de multas*/

    public void addMulta(float multa){
        if (multa <= 0) System.out.printf("Valor da multa inválido!!");
        else this.saldoMultas += multa;
    }

    public void pagarMulta(float pag){
        if (pag <= 0) System.out.printf("Valor de pagamento inválido!!");
        else this.saldoMultas -= pag;
    }
}

