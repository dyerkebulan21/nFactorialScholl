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

public class Sierpinski {
    //  Height of an equilateral triangle whose sides are of the specified length.
    public static double height(double length) {
        double heightTriangle = length * Math.sqrt(3.0) / 2.0;
        return heightTriangle;
    }


    //  Draws a filled equilateral triangle whose bottom vertex is (x, y)
    //  of the specified side length.
    public static void filledTriangle(double x, double y, double length) {
        double heightTriangle = height(length);
        double[] xtriangle = { x - length / 2, x + length / 2, x };
        double[] ytriangle = { y + heightTriangle, y + heightTriangle, y };
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledPolygon(xtriangle, ytriangle);
    }


    //  Draws a Sierpinski triangle of order n, such that the largest filled
    //  triangle has bottom vertex (x, y) and sides of the specified length.
    public static void sierpinski(int n, double x, double y, double length) {
        if (n == 0) return;
        filledTriangle(x, y, length);
        double h = height(length);
        double halfLength = length / 2.0;
        sierpinski(n - 1, x - halfLength, y, length / 2);
        sierpinski(n - 1, x, y + h, length / 2);
        sierpinski(n - 1, x + halfLength, y, length / 2);

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        sierpinski(
                n,
                0.5,
                0.0,
                0.5);
    }
}

