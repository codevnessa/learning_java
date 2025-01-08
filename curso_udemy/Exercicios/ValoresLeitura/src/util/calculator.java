package util;

public class calculator {
    public  double circumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public  double volume(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }
}
