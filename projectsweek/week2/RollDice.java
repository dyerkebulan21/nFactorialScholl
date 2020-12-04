public class RollDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int dice = 10;
        int sides = 6;
        int[] tally = new int[61];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < dice; j++) {
                int r = (int) (Math.random() * sides) + 1;
                sum += r;
            }
            tally[sum]++;

        }
        for (int g = 10; g < 61; g++) {
            System.out.print(g + ":");
            for (int b = 1; b < tally[g]; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
