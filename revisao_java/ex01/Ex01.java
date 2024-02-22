import java.util.Scanner;

public class Ex01{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Entre com seu ano de nascimento: ");
        int nasc = teclado.nextInt();

        System.out.print("Entre com o ano atual: ");
        int atual = teclado.nextInt();

        System.out.println(nome + ", possui " + (atual - nasc) + " anos.");
    }

}