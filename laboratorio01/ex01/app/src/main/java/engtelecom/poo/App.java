/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Ponto p = new Ponto();

        System.out.println(p.toString());

        Ponto b = new Ponto();

        p.setX(2.5);
        p.setY(3);

        b.setX(7);
        b.setY(2);

        System.out.println(p.distancia(b));
    }
}
