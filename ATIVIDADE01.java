package dfdf;

import java.util.Scanner;

public class ATIVIDADE01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Cadastro de Empresa");
            System.out.print("Nome da Empresa: ");
            String nomeEmpresa = input.nextLine();
            
            if (nomeEmpresa.equals("0")) {
                break;
            }
            
            System.out.print("CNPJ: ");
            String cnpj = input.nextLine();
            
            if (cnpj.equals("0")) {
                break;
            }
            
            System.out.print("Renda Bruta Mensal: ");
            double rendaBrutaMensal = input.nextDouble();
            input.nextLine(); 
               
            System.out.println("Empresa cadastrada com sucesso!");
        }
        
        System.out.println("Programa encerrado.");
        input.close();
    }
}
