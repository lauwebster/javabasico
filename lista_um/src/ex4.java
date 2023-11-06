import java.util.Scanner;
import java.math.*;
import static java.lang.Math.pow;

public class ex4 {

    public static double calculaDistancia(double xa, double xb, double ya, double yb){

        double distancia;
        distancia = Math.sqrt( pow((xb - xa), 2) + pow((yb - ya), 2));
        return distancia;
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        double xa, xb, ya, yb;

        System.out.println("Valor ponto XA:");
        xa = leitura.nextDouble();
        System.out.println("Valor ponto XB:");
        xb = leitura.nextDouble();
        System.out.println("Valor ponto YA:");
        ya = leitura.nextDouble();
        System.out.println("Valor ponto YB:");
        yb = leitura.nextDouble();
        System.out.printf("A distância entre eles é %.2f", calculaDistancia(xa, xb, ya, yb));
    }
}
