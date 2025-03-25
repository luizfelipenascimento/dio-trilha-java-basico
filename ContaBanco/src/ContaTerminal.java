import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    
    int numeroConta;
    String nomeTitular, agencia;
    double saldo = 0.0;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta !");
    numeroConta = scanner.nextInt();

    System.out.println("Por favor, digite a Agência !");
    agencia = scanner.next();

    System.out.println("Por favor, digite o nome do titular da conta !");
    nomeTitular = scanner.next();

    System.out.println("Por favor, digite o saldo inicial da conta !");
    saldo = scanner.nextDouble();

    String mensagem = "Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco," + 
      "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo +
      " já está disponível para saque";
    
    System.out.println(mensagem);

    scanner.close();
  }
}
