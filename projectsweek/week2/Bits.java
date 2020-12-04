public class Bits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 1;
        int power = 1;
        if (n < 0) {
            System.out.println("Illegal input");
        } else if (n == 0) {
            System.out.println("Bits " + 0);
        } else {
            while (power <= n / 2) {
                power *= 2;
                sum += 1;

            }
            System.out.println("Bits " + sum);
        }

    }
}
