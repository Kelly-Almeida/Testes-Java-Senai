public class contaBancaria {
    private double saldo;

    public contaBancaria(double saldoInicial){
        if (saldoInicial > 0){
            this.saldo = saldoInicial;
        } else{
            this.saldo = 0;
        }
    }

    public void depositar(double deposito){
        if (deposito > 0){
            this.saldo += deposito;
            System.out.println("Deposito realizado com sucesso. Novo saldo: " + getSaldo());
        }
    }

    public void sacar(double saque){
        if(saque > 0 && saque <= this.saldo){
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo());
        } else{
            System.out.println("Saldo insuficiente");
        }

    }

    public double getSaldo(){return this.saldo;}
}
