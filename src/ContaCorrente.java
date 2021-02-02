// classe com herança da classe ContaUniversal

public class ContaCorrente extends ContaUniversal {
	private double saldoConta;
	private double saldoResidual;
	
	public ContaCorrente() {
		this.saldoConta = 0;
		this.saldoResidual = 0;
	}
	
	public void deposito(double deposito){
        this.saldoResidual = this.saldoConta;
        this.saldoConta += deposito;
    }

    public void saque(double saque){
        if(saque<this.saldoConta) {
            this.saldoResidual = this.saldoConta;
            this.saldoConta -= saque;
        }
        else{
            System.out.println("Valor solicitado não disponivel nesta conta.");
        }
    }

    public void imprimirDadosCorrente(ContaCorrente contaCorrente, ContaUniversal conta){
        System.out.println( "\nNúmero da conta corrente: " + conta.getNumeroConta() +
                            "\nTitular da conta corrente: " + conta.getNome() +
                            "\nAgência: " + conta.getAgencia() +
                            "\nSaldo Atual: " + contaCorrente.getSaldoAtual() +
                            "\nSaldo Anterior: " + contaCorrente.getSaldoResidual() + "\n");
    }

    public double getSaldoAtual() {
        return saldoConta;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoConta = saldoAtual;
    }

    public double getSaldoResidual()  {
        return saldoResidual;
    }

    public void setSaldoResidual(double saldoResidual) {
        this.saldoResidual = saldoResidual;
    }
		
}
