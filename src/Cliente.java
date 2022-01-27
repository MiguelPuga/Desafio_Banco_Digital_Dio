public class Cliente {

    private String nome;
    private final String CPF;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        CPF = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}
