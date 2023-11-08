import java.util.Scanner;

public class urna {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo à urna eletrônica!");
        System.out.println("Quantidade de candidatos:");
        int qtd = sc.nextInt();
        UrnaEletronica u = new UrnaEletronica(qtd);

        System.out.println("Quantidade de candidatos digitada: " + u.getQtdCandidatos());
    }
}
