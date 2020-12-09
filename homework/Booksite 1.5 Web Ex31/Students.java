/* *****************************************************************************
 *  Name:    Yerkebulan Dyussembayev
 *  NetID:   naswaiboys
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Students {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        String[] first = new String[n];
        String[] second = new String[n];
        String[] email = new String[n];
        int[] section = new int[n];

        for (int i = 0; i < n; i++) {
            first[i] = StdIn.readString();
            second[i] = StdIn.readString();
            email[i] = StdIn.readString();
            section[i] = StdIn.readInt();
        }
        StdOut.println("section4");
        StdOut.println("---------");
        for (int i = 0; i < n; i++) {
            if (section[i] == 4) {
                StdOut.print(email[i] + " ");
                StdOut.println();
            }
        }
        StdOut.println("section5");
        StdOut.println("---------");
        for (int i = 0; i < n; i++) {
            if (section[i] == 5) {
                StdOut.print(email[i] + " ");
                StdOut.println();
            }
        }

    }
}
