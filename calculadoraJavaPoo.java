import java.util.Scanner;

public class calculadoraJavaPoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;
        
        do {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz quadrada");
            System.out.println("Q - Sair");
            System.out.print("Opção: ");
            opcao = scanner.next().charAt(0);
            
            switch(opcao) {
                case '1':
                    adicao();
                    break;
                case '2':
                    subtracao();
                    break;
                case '3':
                    multiplicacao();
                    break;
                case '4':
                    divisao();
                    break;
                case '5':
                    potencia();
                    break;
                case '6':
                    raizQuadrada();
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
    
    public static void adicao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 + num2));
    }
    
    public static void subtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 - num2));
    }
    
    public static void multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 * num2));
    }
    
    public static void divisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
        } else {
            System.out.println("Resultado: " + (num1 / num2));
        }
    }
    
    public static void potencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número (expoente): ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + Math.pow(num1, num2));
    }
    
    public static void raizQuadrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Não existe raiz de número negativo.");
        } else {
            System.out.println("Resultado: " + Math.sqrt(num));
        }
    }
}