/*Classe Conta Bancária com Exceções Modifique a classe ContaBancaria do
exercício anterior para lançar uma exceção personalizada
SaldoInsuficienteException quando uma tentativa de saque é feita, mas o
saldo é insuficiente. Teste a classe com um programa que tente fazer um saque
maior que o saldo disponível.*/
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("123456789", 1000.0);

        // Testando os métodos
        conta.verSaldo();            // Deve imprimir o saldo inicial de 1000.0
        conta.depositar(500.0);      // Deve adicionar 500 ao saldo
        conta.verSaldo();            // Deve imprimir o saldo atualizado de 1500.0

        try {
            conta.sacar(2000.0);     // Deve lançar exceção de saldo insuficiente
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        conta.verSaldo();            // Deve imprimir o saldo de 1500.0
    }
}
