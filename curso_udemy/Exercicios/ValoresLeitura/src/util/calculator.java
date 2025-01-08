package util;

public class calculator {
    public static double circumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }
}
