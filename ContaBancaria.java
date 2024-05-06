import java.util.Scanner;

public class ContaBancaria {
    private String nomePessoa;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomePessoa, int numeroConta, double saldoInicial) {
        this.nomePessoa = nomePessoa;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        System.out.println("Conta bancária criada com sucesso.");
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome da pessoa:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);
        
        char opcao;
        do {
            System.out.println("\nEscolha a operação:");
            System.out.println("D - Depositar");
            System.out.println("S - Sacar");
            System.out.println("B - Verificar saldo");
            System.out.println("Q - Sair");
            System.out.print("Opção: ");
            opcao = scanner.next().charAt(0);
            
            switch(opcao) {
                case 'D':
                case 'd':
                    System.out.println("Informe o valor a depositar:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 'S':
                case 's':
                    System.out.println("Informe o valor a sacar:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 'B':
                case 'b':
                    System.out.println("Saldo disponível: R$ " + conta.getSaldo());
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 'Q' && opcao != 'q');

        scanner.close();
    }
}