import java.util.Locale;
import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Nome: ");
            String name = scanner.next();

            System.out.println("Digite o numero da sua agência: ");
            int agency = scanner.nextInt();

            System.out.println("Digite o numero da sua conta: ");
            int numberAccount = scanner.nextInt();

            System.out.println("Seu saldo ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco," +
                    " sua agência é: " + agency + " portador da conta:  " + numberAccount + " e seu saldo de R$" + saldo +
                    " já está disponível para saque.");
            }
    }
