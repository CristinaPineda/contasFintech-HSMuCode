// classe com os atributos e metodos usados na conta-corrente e conta-investimento

public class ContaUniversal {
	protected String nome;
	protected String cpf;
	protected int agencia;
	protected int numeroConta;
	
	public ContaUniversal() {
		this.numeroConta = 1234;
		this.agencia = 23456;
	}
	
	public static void dadosConta(ContaUniversal contanova) {
		System.out.println("Titular da conta: "+contanova.getNome()+
							"\nNúmero da conta: "+contanova.getNumeroConta()+
                			"\nAgência: "+contanova.getAgencia() +"\n");
	}
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
