public class RGBtoCMYK {
    public static void main(String[] args) {
        double R = Double.parseDouble(args[0]);
        double G = Double.parseDouble(args[1]);
        double B = Double.parseDouble(args[2]);
        double white = Math.max(R / 255, Math.max(G / 255, B / 255));
        double cyan = (white - R / 255) / white;
        double magenta = (white - G / 255) / white;
        double yellow = (white - B / 255) / white;
        double black = 1 - white;
        System.out.println("red = " + (int) R);
        System.out.println("green = " + (int) G);
        System.out.println("blue = " + (int) B);
        System.out.println("cyan = " + cyan);
        System.out.println("magenta = " + magenta);
        System.out.println("yellow = " + yellow);
        System.out.println("black = " + black);

    }
}
