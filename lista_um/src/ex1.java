import java.util.Scanner;

public class ex1 {

    public static double milhas(double metros){
        return metros * 0.000621371192;
    }
    public static double pes(double metros){
        return metros * 3.281;
    }
    public static double polegadas(double metros){
        return metros * 39.37;
    }
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Medida em metros:");
        double metros = leitura.nextDouble();
        System.out.printf("Retorno em milhas: %.8f\n", milhas(metros));
        System.out.printf("Retorno em pés: %.2f\n", pes(metros));
        System.out.printf("Retorno em polegadas: %.2f\n", polegadas(metros));
    }
}