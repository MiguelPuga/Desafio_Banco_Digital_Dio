public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 001;

    private final Banco BANCO;
    protected final Cliente TITULAR;

    protected int agencia;
    protected int numero;

    protected double saldo;

    public Conta(Banco banco, Cliente titular, double saldo) {
        this.BANCO = banco;
        this.BANCO.adicionarConta(this);
        this.TITULAR = titular;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = banco.getSequencial();
        this.saldo = saldo;
        banco.setSequencial(banco.getSequencial() + 1);
    }

    public Conta(Banco banco, Cliente titular, double saldo, int agencia) {
        this.BANCO = banco;
        this.BANCO.adicionarConta(this);
        this.TITULAR = titular;
        this.agencia = agencia;
        this.numero = banco.getSequencial();
        this.saldo = saldo;
        banco.setSequencial(banco.getSequencial() + 1);
    }

    public void sacar(double valor)
    {
        if(saldo < valor)
        {
            System.out.println("Não foi possível efetuar o saque," +
                    " verifique se há saldo suficiente para a operação.");
            return;
        }
        saldo -= valor;
    }

    public void depositar(double valor)
    {
        saldo += valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s%n", TITULAR.getNome());
        System.out.printf("Agência: %d%n", agencia);
        System.out.printf("Número: %d%n", numero);
        System.out.printf("Saldo: %.2f R$%n", saldo);
        System.out.printf("O Banco %s agradece a sua preferência.%n%n", BANCO.getNome());
    }

    public void transferir(double valor, Conta recebedor)
    {
        if(saldo < valor)
        {
            System.out.println("Não foi possível efetuar a transferência," +
                    " verifique se há saldo suficiente para a operação.");
            return;
        }

        sacar(valor);
        recebedor.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
