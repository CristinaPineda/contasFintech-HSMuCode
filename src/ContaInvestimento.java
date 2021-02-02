// classe com herança da classe ContaUniversal

public class ContaInvestimento extends ContaUniversal{
	private double saldoConta;
    private double saldoResidual;
    private double saldoEspecial;

    public ContaInvestimento() {
    	this.saldoConta = 0;
        this.saldoResidual = 0;
        
    }

    public void deposito(double deposito){
        this.saldoResidual = this.saldoConta;
        double bonusEspecial = deposito * 0.01;
        this.saldoConta += (deposito + bonusEspecial);
        this.saldoEspecial = this.saldoConta*2;
    }

    public void saque(double saque){
        if(saque<this.saldoEspecial) {
            this.saldoResidual = this.saldoConta;
            this.saldoConta -= saque;
            this.saldoResidual = this.saldoConta * 2;
        }
        else{
            System.out.println("Valor solicitado não disponivel nesta conta.");
        }
    }

    public void limiteEspecial(ContaInvestimento conta){
        double limiteBonus = this.saldoConta*2;
    }

    public void imprimirDadosInvestimento(ContaInvestimento contaInvestimento, ContaUniversal conta){
        System.out.println("Número da conta investimento: " + conta.getNumeroConta() +
                           "\nTitular da conta investimento: " + conta.getNome() +
                           "\nAgência: " + conta.getAgencia() +
                           "\nSaldo Atual: " + contaInvestimento.getSaldoConta() +
                           "\nLimite (Bônus do limite incluso: " + contaInvestimento.getSaldoEspecial() +
                           "\nSaldo Anterior: " + contaInvestimento.getSaldoResidual() + "\n");
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoAtual) {
        this.saldoConta = saldoAtual;
    }

    public double getSaldoResidual() {
        return saldoResidual;
    }

    public void setSaldoResidual(double saldoResidual) {
        this.saldoResidual = saldoResidual;
    }

    public double getSaldoEspecial() {
        return saldoEspecial;
    }

    public void setSaldoEspecial(double saldoespecial) {
        this.saldoEspecial = saldoespecial;
    }

}
