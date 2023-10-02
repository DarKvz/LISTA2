package aba;
import java.util.Scanner;
public class ATIVIDADE02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String senhaCorreta = "123";
        String senhaDigitada;
        
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = input.nextLine();
            
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta");
            }
        } while (!senhaDigitada.equals(senhaCorreta));
        
        System.out.println("SENHA CORRETA");
        
        int escolha;
        
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastro cliente");
            System.out.println("2. Compra de carro");
            System.out.println("3. Compra de acessório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = input.nextInt();
            input.nextLine(); 
            
            switch (escolha) {
                case 1:
                    cadastrarCliente(input);
                    break;
                case 2:
                    comprarCarro(input);
                    break;
                case 3:
                    comprarAcessorio(input);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (escolha != 0);
        
        input.close();
    }
    
    public static void cadastrarCliente(Scanner input) {
        System.out.println("\nCadastro de Cliente:");
        System.out.print("Nome do cliente: ");
        String nomeCliente = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Endereco: ");
        String endereco = input.nextLine();
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    public static void comprarCarro(Scanner input) {
        System.out.println("\nCompra de Carro:");
        System.out.println("Opcoes de carros:");
        System.out.println("1. Carro A");
        System.out.println("2. Carro B");
        System.out.println("3. Carro C");
        System.out.print("Escolha um carro (1/2/3): ");
        int escolhaCarro = input.nextInt();
        input.nextLine(); 
        
        String[] carros = {"Carro A", "Carro B", "Carro C"};
        String carroEscolhido = carros[escolhaCarro - 1];
        
        System.out.print("Cor do carro: ");
        String corCarro = input.nextLine();
        System.out.print("Forma de pagamento: ");
        String formaPagamento = input.nextLine();
        System.out.println("Compra de " + carroEscolhido + " realizada com sucesso!");
    }
    
    public static void comprarAcessorio(Scanner input) {
        System.out.println("\nCompra de Acessorio:");
        System.out.print("Nome do acessorio: ");
        String nomeAcessorio = input.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine(); 
        System.out.println("Compra de " + quantidade + " " + nomeAcessorio + "(s) realizada com sucesso!");
    }
}