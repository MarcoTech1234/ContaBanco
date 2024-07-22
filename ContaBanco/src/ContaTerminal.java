import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Variaveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuario

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = teclado.nextInt();
        teclado.nextLine(); // Limpando o Buffer "/n"

        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = teclado.next();
        teclado.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = teclado.next();
        teclado.nextLine();

        System.out.println("Por favor digite o valor do saldo: ");
        saldo = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco,\n" +
                "sua agência é " + agencia +", numero da conta " + numeroConta + " e seu saldo \n" +
                "é " + saldo + " reais já está disponível para saque");

        teclado.close();
    }
}
