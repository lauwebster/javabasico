import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Bingo ***");
        System.out.println("Informe até qual valor deseja sortear:");
        int valor = sc.nextInt();
        Bingo B = new Bingo(valor);

        for(int i = 0; i <= 6; i++){
            B.sorteio();
            System.out.println("Número sorteado: " + B.getValorAtual());
        }
    }
}