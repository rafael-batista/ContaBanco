import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados solicitados");

        System.out.println("Digite o número da Agência");
        int agencia = sc.nextInt();

        System.out.println("Digite o número da Conta");
        int conta = sc.nextInt();

        System.out.println("Digite o primeiro nome");
        String primeiroNome = sc.next();

        System.out.println("Digite o sobrenome");
        String sobrenome = sc.next();

        System.out.println("Digite o saldo");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + primeiroNome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }


}
