import java.io.IOException;
import java.util.Scanner;
public class Autonomia {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int horas = 0;
        int velocidade = 0;
        double litros = 0;

        horas = s.nextInt();
        velocidade = s.nextInt();
        int distancia = velocidade * horas;
        double dist = (double) distancia;
        double autonomia = dist / 12;
        System.out.printf("%.3f\n", autonomia);

    
    }
 
}