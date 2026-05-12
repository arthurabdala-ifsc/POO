package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class App {
    static void main() throws InterruptedException {

        Draw draw = new Draw();

        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);

        draw.setPenColor(Color.RED);

//        draw.circle(200,200,100);
//        draw.circle(400,200,100);
//
//        draw.line(200,300,200,600);
//        draw.line(400,300,400,600);
//
//        draw.circle(300,600,100);
//
//        draw.line(300,650,300,700);

        draw.setPenColor(Color.RED);

        draw.enableDoubleBuffering();

//        for (int i = 0; i < 800; i+=5) {
//            draw.line(i, 0, i, 800);
//            draw.line(0, i, 800, i);
//
//        }

        draw.show();

        draw.setFontSize(30);

        for (int i = 0; i < 10; i++) {
            draw.clear();
            draw.text(400,400, "" + i);
            draw.show();
            TimeUnit.MILLISECONDS.sleep(500);
        }

        draw.clear();

        draw.circle(300,500,100);
        draw.circle(500,500,100);

        double[] x = {210,400,590};
        double[] y = {450,200,450};

        draw.polygon(x,y);

        draw.show();

    }
}
