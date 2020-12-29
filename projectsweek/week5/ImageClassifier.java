import java.awt.Color;

public class ImageClassifier {
    public static double[] extractFeatures(Picture picture) {
        int width = picture.width();
        int height = picture.height();
        double[] vector = new double[width * height];
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < height; col++) {
                Color color = picture.get(col, row);
                vector[row * height + col] = color.getRed();
            }

        }

        return vector;
    }

    public static void main(String[] args) {
        In training = new In(args[0]);
        int mtraining = training.readInt();
        int width = training.readInt();
        int height = training.readInt();
        int ntraining = width * height;
        MultiPerceptron multiPerceptron = new MultiPerceptron(mtraining, ntraining);

        while (!training.isEmpty()) {
            String image = training.readString();
            int number = training.readInt();
            Picture picture = new Picture(image);
            double[] trainingfile = extractFeatures(picture);
            multiPerceptron.trainMulti(trainingfile, number);
        }

        In testing = new In(args[1]);
        int testerror = 0;
        int sumPhotoTrain = 0;
        int mTesting = testing.readInt();
        int widthTesting = testing.readInt();
        int heightTesting = testing.readInt();

        while (!testing.isEmpty()) {
            String image = testing.readString();
            Picture picture1 = new Picture(image);
            int number = testing.readInt();
            double[] testingfile = extractFeatures(picture1);
            int labelPredict = multiPerceptron.predictMulti(testingfile);
            sumPhotoTrain++;
            if (labelPredict != number) {
                StdOut.println(image);
                testerror++;
            }
        }
        double testerrorprint = 1.0 * testerror / sumPhotoTrain;
        StdOut.print("test error rate =  " + testerrorprint);
    }
}
