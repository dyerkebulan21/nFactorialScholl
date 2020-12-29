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

import edu.princeton.cs.algs4.StdOut;

public class GoldenRatio {
    public static double GoldenRation(double n) {
        if (n == 0) return 1;
        return 1.0 + 1.0 / GoldenRation(n - 1);
    }

    public static void main(String[] args) {
        double n = Integer.parseInt(args[0]);
        StdOut.print(GoldenRation(n));
    }
}
