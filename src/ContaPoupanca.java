public class ContaPoupanca extends Conta {


    public ContaPoupanca(Banco banco, Cliente titular, double saldo) {
        super(banco, titular, saldo);
    }

    public ContaPoupanca(Banco banco, Cliente titular, double saldo, int agencia) {
        super(banco, titular, saldo, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato: Conta Poupança ***");
        super.imprimirExtrato();
    }
}
