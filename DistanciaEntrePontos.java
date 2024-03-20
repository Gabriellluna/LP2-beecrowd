import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        double[] x;
        x = new double[4];

        for(int i = 0; i < 4; i++){
            x[i] = s.nextDouble();
        }

        double distancia = ((x[2] - x[0]) * (x[2] - x[0])) + ((x[3] - x[1]) * (x[3] - x[1])) ;
        distancia = Math.sqrt(distancia);
        System.out.printf("%.4f\n", distancia);


    
    }
 
}