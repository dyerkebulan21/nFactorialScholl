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

public class staircase {
    public static void staircase(int n) {
        //   #
        //  ##
        // ###
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter++;
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= counter - 1; j++) {
                System.out.print("#");
            }

            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        staircase(6);
    }
}
