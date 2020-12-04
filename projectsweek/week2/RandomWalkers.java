public class RandomWalkers {
    public static void main(String[] args) {
        int step = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSquaredDistance = 0.0;
        int stepY = 0;
        int stepX = 0;
        for (int i = 0; i < trials; i++) {
            for (int j = 0; j < step; j++) {
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
                totalSquaredDistance = stepX * stepX + stepY * stepY;
            }
            totalSquaredDistance++;

        }
        System.out.println(1 * (totalSquaredDistance / trials));

    }
}
