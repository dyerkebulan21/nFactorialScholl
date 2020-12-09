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

public class PlotFunctionEx {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // точки для отрезков
        double[] x = new double[N + 1]; // для х
        double[] y = new double[N + 1]; // для y
        for (int i = 0; i <= N; i++) {
            x[i] = Math.PI * i / N;
            y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
        }
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, +2.0);
        for (int i = 0; i < N; i++) {
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
        }
    }
}
