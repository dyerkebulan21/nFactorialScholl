/* *****************************************************************************
 *  Name:    Ada Lovelace
 *  NetID:   alovelace
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Transform2D {
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            double xscale = x[i] * alpha;
            x[i] = xscale;
        }
        StdOut.println();
        for (int i = 0; i < y.length; i++) {
            double yscale = y[i] * alpha;
            y[i] = yscale;
        }
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            double xtranslate = x[i] + dx;
            x[i] = xtranslate;
        }
        for (int i = 0; i < y.length; i++) {
            double ytranslate = y[i] + dy;
            y[i] = ytranslate;
        }
    }

    public static double[] copy(double[] array) {
        double[] arrcopy = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrcopy[i] = array[i];
        }
        return arrcopy;
    }

    public static void rotate(double[] x, double[] y, double theta) {
        double radians = Math.toRadians(theta);
        double xalpha = 0.0;
        double yalpha = 0.0;
        double[] xdash = new double[x.length];
        double[] ydash = new double[y.length];
        for (int i = 0; i < x.length; i++) {
            xdash[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            ydash[i] = y[i];
        }

        for (int i = 0; i < xdash.length; i++) {
            xalpha = xdash[i] * Math.cos(radians) - ydash[i] * Math.sin(radians);
            x[i] = xalpha;
        }

        for (int i = 0; i < ydash.length; i++) {
            yalpha = ydash[i] * Math.cos(radians) + xdash[i] * Math.sin(radians);
            y[i] = yalpha;
        }

    }


    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        // Copy of original polygon
        double[] cx = copy(x);
        double[] cy = copy(y);

        // Rotate, translate and draw the copy
        rotate(cx, cy, -45.0);
        translate(cx, cy, 1.0, 2.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(cx, cy);

        // Draw the original polygon
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);


    }
}
