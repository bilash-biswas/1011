import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double c,d;
        Scanner input = new Scanner(System.in);
        c = input.nextDouble();
        d = (4 / 3.0) * 3.14159 * c * c * c;
        System.out.printf("VOLUME = %.3f\n", d);
    }
}
