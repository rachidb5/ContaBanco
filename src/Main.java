import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();

        Scanner scanner1;
        scanner1 = new Scanner(System.in);
        System.out.println( "Por favor, digite o número da Agência !");
        conta.setAgencia(scanner1.next());

        Scanner scanner2;
        scanner2 = new Scanner(System.in);
        System.out.println( "Por favor, digite o seu nome!");
        conta.setNome_cliente(scanner2.next());

        Scanner scanner3;
        scanner3 = new Scanner(System.in);
        System.out.println( "Por favor, digite o salario!");
        conta.setSalario(new BigDecimal(scanner3.next()));

        Scanner scanner4;
        scanner4 = new Scanner(System.in);
        System.out.println( "Por favor, digite o numero da sua conta!");
        conta.setNumero(Integer.parseInt(scanner4.next()));

        System.out.println(conta);
    }
}