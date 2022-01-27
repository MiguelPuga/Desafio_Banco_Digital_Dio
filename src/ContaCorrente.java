public class ContaCorrente extends Conta {

    public ContaCorrente(Banco banco, Cliente titular, double saldo) {
        super(banco, titular, saldo);
    }

    public ContaCorrente(Banco banco, Cliente titular, double saldo, int agencia) {
        super(banco, titular, saldo, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato: Conta Corrente ***");
        super.imprimirExtrato();
    }
}
