/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;


import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class App {

    public static void main(String[] args) {

        Draw draw = new Draw("gg");

        draw.setCanvasSize(800, 800);

        draw.setXscale(0,800);
        draw.setYscale(0,800);

        draw.setPenColor(Color.BLUE);

        draw.clear(Color.LIGHT_GRAY);

        draw.filledSquare(200, 300, 100);

        draw.picture(500, 600, "o-meu-lapada-seca-coisou-v0-y991xnmhy5gb1.png");










        // draw.clear(Color.LIGHT_GRAY);

        // draw.setPenColor(Color.BLUE);

        // draw.filledCircle(.5, .5, .1);

        // draw.text(.7,.2,"bipapaparapo");

        // draw.setPenRadius(.15);

        // draw.line(.1, .1, .5, .9);
    }
}
