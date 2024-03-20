import java.io.IOException;
import java.util.Scanner;
public class SalarioComBonus {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
       
        String nome;
        double vendas;
        double salario = 0;
        nome = s.nextLine();
        salario = s.nextDouble();
        vendas = s.nextDouble();

        salario = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n" , salario);
    }
 
}