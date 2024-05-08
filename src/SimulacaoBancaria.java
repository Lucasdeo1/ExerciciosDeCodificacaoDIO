import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        Boolean continuar = true;
        //System.out.println("1.Depositar\n2.Sacar\n3.Consultar Saldo\n4.Encerrar");
        // Loop infinito para manter o programa em execução até que o usuário decida sair
  
        while (continuar) {
            int opcao = scanner.nextInt(); 
            
            // Implementando as condições necessárias para avaliar a opção escolhida:
            // Utilizando switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo = depositar(valorDeposito, saldo);
                    System.out.println("Saldo atual: " + saldo); 
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    saldo = sacar(valorSaque, saldo);
                    if( saldo > 100){
                      System.out.println("Saldo atual: " + saldo);
                      break;
                    }else {
                      break;
                    }
                case 3:
                    consultar(saldo);
                    break;
                default:
                    System.out.println("Programa encerrado.");
                    continuar = false;
            }
        }
    }
    
    public static double depositar(double valor, double saldo ) {
        saldo += valor;
        //System.out.println("Valor depositado: " + valor);
        return saldo;
    }
    
    public static double sacar(double valor, double saldo){
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return saldo;
        } else {
            saldo -= valor;
            return saldo;
        }
    }
    
    public static void consultar(double saldo){
        System.out.println("Saldo atual: " + saldo);
    }
}
