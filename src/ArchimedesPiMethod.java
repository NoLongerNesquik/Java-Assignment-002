import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        double sides = 8;
        double angleB = 360/sides;
        double angleA = angleB/2;
        double triangleBase = 2 * Math.sin(Math.toRadians(angleA));
        double perimeter = sides * triangleBase;
        double pi = perimeter/2;
        System.out.println(pi);

    }
}
