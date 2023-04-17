import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto0;
        double imposto1 = 0;
        double imposto2 = 0;
        double imposto3 = 0;

        if (renda >= 2000.01){
            imposto1 = (renda - 2000) * 0.08;
        } if (renda >= 3000.01) {
            imposto2 = (renda - 3000) * 0.1;
        } if (renda > 4500) {
            imposto3 = (renda - 4500) * 0.1;
        } if (renda <= 2000) {
            System.out.println("Isento");
        }else {
            double totalImpostos = imposto1 + imposto2 + imposto3;
            System.out.printf( "R$ " + "%.2f", totalImpostos );
    }

    }
}