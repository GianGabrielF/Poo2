import java.util.Random;
import java.util.Scanner;

public class Ex03_Akinator_do_paraguai {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Random r = new Random();

        int n = r.nextInt(100) + 1;


        System.out.print("Um número de 1 a 100 foi sorteado, forneça o seu palpite: ");
        int i;
        do{
            i = teclado.nextInt();

            if(i > n){
                System.out.println("o seu número é maior que o número escolhido");
            } else if (i < n) {
                System.out.println("o seu número é menor que o número escolhido");
            } else {
                System.out.println("Parabéns! Você acertou o número escolhido");
            }
        } while (i != n);


    }
}
