public class Teste5 {
    public static void main(String[] args){
        contaBancaria minhaConta = new contaBancaria(100.0);


        minhaConta.depositar(50.0);
        minhaConta.sacar(30.0);
        minhaConta.sacar(200);

        System.out.println("Saldo final: " + minhaConta.getSaldo());
    }
}