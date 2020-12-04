public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        // x < y < z -> 10 17 49 -> x < y && y < z
        boolean res = (x < y) && (y < z);
        System.out.println(res);
    }
}
