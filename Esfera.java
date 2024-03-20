import java.io.IOException;
import java.util.Scanner;
 

public class Esfera {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        double raio = 0;
        final double PI = 3.14159;

        raio = s.nextDouble();

        double volume =  (4.0/3.0) * PI * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);


    }
 
}