/*Classe ContaBancaria Crie uma classe ContaBancaria com os atributos
numeroDaConta e saldo. A classe deve ter métodos para depositar(),
sacar() e verSaldo(). O método depositar() deve adicionar o valor ao saldo,
o método sacar() deve subtrair o valor do saldo e o método verSaldo() deve
imprimir o saldo atual. Crie um objeto da classe ContaBancaria e teste os
métodos.*/
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("123456789", 1000.0);

        // Testando os métodos
        conta.verSaldo();            // Deve imprimir o saldo inicial de 1000.0
        conta.depositar(500.0);      // Deve adicionar 500 ao saldo
        conta.verSaldo();            // Deve imprimir o saldo atualizado de 1500.0
        conta.sacar(200.0);          // Deve subtrair 200 do saldo
        conta.verSaldo();            // Deve imprimir o saldo atualizado de 1300.0
        conta.sacar(2000.0);         // Deve mostrar mensagem de saldo insuficiente
        conta.verSaldo();            // Deve imprimir o saldo de 1300.0
    }
}
