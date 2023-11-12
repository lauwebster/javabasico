import java.util.Scanner;

public class Programa {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        String resposta = null;
        int centroX, centroY, raio;
        Circulo c1 = new Circulo(3, 3, 3);

        System.out.println("Método Círculo");
        System.out.println("Centro X: " + c1.getCentroX());
        System.out.println("Centro Y: " + c1.getCentroY());
        System.out.println("Raio: " + c1.getRaio());

        System.out.println("Cálculo da área");
        System.out.println("Área: " + c1.area());

        System.out.println("Cálculo do perímetro");
        System.out.println("Perímetro: " + c1.perimetro());

        System.out.println("Deseja alterar os valores? - SIM/NÃO");
        resposta = sc.nextLine();
        do{
            if(resposta.toUpperCase().equals("SIM")){
                System.out.println("Informe os novos valores:");
                centroX = sc.nextInt();
                centroY = sc.nextInt();
                raio = sc.nextInt();
                c1.move(centroX, centroY, raio);
                System.out.println("Valores atualizados:");
                System.out.println("Centro X: " + c1.getCentroX());
                System.out.println("Centro Y: " + c1.getCentroY());
                System.out.println("Raio: " + c1.getRaio());
            }
            System.out.println("Deseja alterar os valores?"); //sai lido
            resposta = sc.nextLine();
        }while(resposta != "\n");
    }
}
