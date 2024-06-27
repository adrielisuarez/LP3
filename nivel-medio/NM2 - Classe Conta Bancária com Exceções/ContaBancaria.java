public class ContaBancaria {
    // Atributos da classe ContaBancaria
    private String numeroDaConta;
    private double saldo;

    // Construtor para inicializar os atributos
    public ContaBancaria(String numeroDaConta, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar valor no saldo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar valor do saldo
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque de R$" + valor);
        }
    }

    // Método para ver o saldo atual
    public void verSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    // Getters e Setters para os atributos
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
