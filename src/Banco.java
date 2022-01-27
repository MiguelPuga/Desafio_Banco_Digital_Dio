import java.util.ArrayList;
import java.util.List;

public class Banco {

    private int sequencial = 1;

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta)
    {
        contas.add(conta);
    }

    public void listarContas()
    {
        for (Conta conta: contas) {
            System.out.printf("Conta: %d, Titular: %s, ", conta.numero, conta.TITULAR.getNome());
            if(conta.getClass() == ContaCorrente.class)
            {
                System.out.printf("Tipo: Conta Corrente%n");
            }else
            {
                System.out.printf("Tipo: Conta Poupança%n");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
}
