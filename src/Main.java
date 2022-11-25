import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       int numero;

        System.out.println("***** Bem vindo ao programa para saber se o número informado é Par ou Ímpar *****");

        System.out.print("Digite um número: ");
        numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número que você informou é Par");
        } else {
            System.out.println("O número que você informou é Ímpar");
        }

    }
}