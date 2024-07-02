import java.util.Scanner;

public class contaTerminal {
        
   public static void main(String[] args) {
        
       Scanner  conta_cliente = new Scanner(System.in);

       System.out.println("Digite seu nome: "); 
       String nome = conta_cliente.nextLine();
       
       System.out.println("digite sua agência:");
       Integer agencia = conta_cliente.nextInt();
    
        
       System.out.println("Digite sua contaCorrente: ");
         Integer contacorrente = conta_cliente.nextInt();
       
       System.out.println("Digite o seu saldo: ");
       float saldo = conta_cliente.nextFloat();

       System.out.println("Meu nome: "+nome);
       System.out.println("Numero da agência:" +agencia );
       System.out.print("Número da Cc: " +contacorrente);
       System.out.println("Seu saldo é de R$: " + saldo);
       System.out.println("Seja bem vindo ao nosso banco ");

    



    

    }
}