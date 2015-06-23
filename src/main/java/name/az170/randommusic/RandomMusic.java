package name.az170.randommusic;

public class RandomMusic {

    public int random(int length, double min, double max) {
        return specify(length, min, max, Math.random());
    }

    public int specify(int length, double min, double max, double random) {
        double simpleMin = 1.0;
        double simpleMax = max / min;

        double integral = random * (simpleMax + simpleMin) * length / 2;
        double a = (simpleMin - simpleMax) / (2 * length);
        double b = simpleMax;
        double c = -integral;
        double x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        return (int) Math.floor(x) + 1;
    }
    
}
