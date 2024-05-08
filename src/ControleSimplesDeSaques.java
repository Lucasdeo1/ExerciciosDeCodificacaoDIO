import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite");
        double limiteDiario = scanner.nextDouble();
        double subtrai = 0.0;
        /*double saque = scanner.nextDouble();
    
        System.out.println( saque );*/

        for (int i = 0; i < 1000;i++ ){
            double saque = scanner.nextDouble();
            if(saque > limiteDiario){
                System.out.println("Limite diario de saque atingido");
            }else {
                subtrai = limiteDiario - saque;
                System.out.println("Saque realizado. Limite restante: "+ subtrai);
                i = 1001;
            } 
        }

        System.out.println("Transacoes encerradas.");



// TODO: Crie um loop 'for' para iterar sobre os saques:
        
// TODO: Solicite ao usuário o valor do saque:
           

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;

           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            

// TODO: Informe que o saque foi realizado e mostre o limite restante:


// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}