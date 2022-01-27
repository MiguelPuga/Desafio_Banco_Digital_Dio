public class Main {

    /*
    Código para simular o funcionamento de um banco simples:
    - saques
    - depósitos
    - transferências

    @autor MiguelPuga
    */

    public static void main(String[] args) {

        Banco bancoDaDio = new Banco("DioBank");
        Banco bancoDaGFT = new Banco("GFTBank");

        Cliente joao = new Cliente("João Silva Sauro", "12345678901");
        Cliente paulo = new Cliente("Paulo Oliva Oliveira", "00000000001");
        Cliente pedro = new Cliente("Pedro Rocha", "12345678905");
        Cliente Jose = new Cliente("Jose Santos", "00000000021");


        ContaCorrente correnteJoao = new ContaCorrente(bancoDaDio, joao, 200);
        ContaPoupanca poupancaJoao = new ContaPoupanca(bancoDaDio, joao, 0);

        ContaCorrente correnteJoaoGFT = new ContaCorrente(bancoDaGFT, joao, 500);
        ContaPoupanca poupancaJoaoGFT = new ContaPoupanca(bancoDaGFT, joao, 0);

        ContaCorrente correntePaulo = new ContaCorrente(bancoDaDio, paulo, 100);
        ContaPoupanca poupancaPaulo = new ContaPoupanca(bancoDaDio, paulo, 0);

        ContaCorrente correntePedro = new ContaCorrente(bancoDaGFT, pedro, 50);
        ContaPoupanca poupancaPedro = new ContaPoupanca(bancoDaGFT, pedro, 50);

        ContaCorrente correnteJose = new ContaCorrente(bancoDaGFT, Jose, 0);
        ContaPoupanca poupancaJose = new ContaPoupanca(bancoDaGFT, Jose, 100);


        correnteJoao.sacar(300);
        poupancaJose.transferir(300, correnteJose);
        correnteJoaoGFT.transferir(250, poupancaJoaoGFT);
        correntePedro.sacar(50);

        correnteJoao.imprimirExtrato();
        poupancaJoao.imprimirExtrato();

        correntePaulo.imprimirExtrato();
        poupancaPaulo.imprimirExtrato();

        correntePedro.imprimirExtrato();
        poupancaPedro.imprimirExtrato();
    }
}
