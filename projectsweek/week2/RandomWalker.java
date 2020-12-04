public class RandomWalker {
    public static void main(String[] args) {
        int step = Integer.parseInt(args[0]);
        int stepX = 0;
        int stepY = 0;
        System.out.println("(" + stepX + ", " + stepY + ")");
        for (int i = 0; i <= step; i++) {
            double random = Math.random();
            if (random <= 0.25) {
                stepX += 1;
            } else if (random <= 0.5) {
                stepY += 1;
            } else if (random <= 0.75) {
                stepX -= 1;
            } else {
                stepY -= 1;
            }
            System.out.println("(" + stepX + ", " + stepY + ")");
        }

        double res = Math.pow(stepX, 2) + Math.pow(stepY, 2);
        System.out.println("squared distance " + (int) res);

    }
}
