// step 1 parse command line arguments
// read universe from stInput

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class NBody {
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        int n = StdIn.readInt();
        double radius = StdIn.readDouble();

        double[] px = new double[n];
        double[] py = new double[n];
        double[] vx = new double[n];
        double[] vy = new double[n];
        double[] mass = new double[n];

        String[] image = new String[n];

        for (int i = 0; i < n; i++) {
            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString();
        }
        StdOut.printf("%d\n", n);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < n; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          px[i], py[i], vx[i], vy[i], mass[i], image[i]);
        }

        StdDraw.setXscale(-radius, radius);
        StdDraw.setYscale(-radius, radius);
        StdDraw.enableDoubleBuffering();
        double G = 6.674 * Math.pow(10, -11);

        for (double t = 0.0; t <= T; t += dt) {
            //StdOut.println("t = " + t);

      
            double[] fx = new double[n];
            double[] fy = new double[n];
            double[] ax = new double[n];
            double[] ay = new double[n];
            StdDraw.picture(0, 0, "starfield.jpg");
            StdAudio.play("2001.wav");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j += 1) {
                    if (i != j) {
                        double deltaX = px[j] - px[i];
                        double deltaY = py[j] - py[i];
                        double RtoIJ = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
                        double FIJ = G * mass[i] * mass[j] / Math.pow(RtoIJ, 2);
                        double FxItoJ = FIJ * (px[j] - px[i]) / RtoIJ;
                        double FyItoJ = FIJ * (py[j] - py[i]) / RtoIJ;
                        fx[i] += FxItoJ;
                        fy[i] += FyItoJ;
                    }

                }

            }

            for (int g = 0; g < n; g++) {

                ax[g] = fx[g] / mass[g];
                ay[g] = fy[g] / mass[g];
                vx[g] = vx[g] + (ax[g] * dt);
                px[g] = px[g] + (vx[g] * dt);
                vy[g] = vy[g] + (ay[g] * dt);
                py[g] = py[g] + (vy[g] * dt);
                StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                              px[g], py[g], vx[g], vy[g], mass[g], image[g]);

            }

            for (int i = 0; i < n; i++) {
                StdDraw.picture(px[i], py[i], image[i]);
            }

            StdDraw.show();
            StdDraw.pause(20);


        }


    }
}
