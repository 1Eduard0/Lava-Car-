import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("12345-678", "João");
        Funcionario funcionario = new Funcionario("98765-432", "Maria", "3000");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ver descrição do Cliente");
            System.out.println("2. Ver descrição do Funcionário");
            System.out.println("3. Adicionar Carro ao Cliente");
            System.out.println("4. Visualizar Carros do Cliente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cliente.imprimirDescricao();
                    break;
                case 2:
                    funcionario.imprimirDescricao();
                    break;
                case 3:
                    System.out.print("Digite a marca do carro: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o número de portas do carro: ");
                    int portas = scanner.nextInt();
                    scanner.nextLine(); 
                    Carro carro = new Carro(marca, modelo, portas);
                    cliente.adicionarCarro(carro);
                    System.out.println("Carro adicionado com sucesso.");
                    break;
                case 4:
                    cliente.visualizarCarros();
                    break;
                case 5:
                    System.out.println("Saindo do sistema");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}