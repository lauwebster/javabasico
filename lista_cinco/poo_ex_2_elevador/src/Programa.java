import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Programa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char op = 0;
        System.out.println("Sistema de elevador");
        System.out.println("Informe o total de andares do prédio");
        int total = sc.nextInt();
        System.out.println("Informe a capacidade:");
        int capacidade = sc.nextInt();
        Elevador A = new Elevador(total, capacidade);
        System.out.println("Seleciona sua opção: ");
        System.out.println("A - Entrar no elevador");
        System.out.println("B - Subir um andar");
        System.out.println("C - Descer um andar");
        System.out.println("D - Sair do elevador");
        System.out.println("S - Encerrar programa");
        do{
            op = sc.next().charAt(0);
            switch (toUpperCase(op)){
                case 'A':
                    A.Entrar();
                    break;
                case 'B':
                    A.subir();
                    break;
                case 'C':
                    A.descer();
                    break;
                case 'D':
                    A.sair();
                    break;
            }
            //sai lido
            System.out.println("Seleciona sua opção: ");
            System.out.println("A - Entrar no elevador");
            System.out.println("B - Subir um andar");
            System.out.println("C - Descer um andar");
            System.out.println("D - Sair do elevador");
            System.out.println("S - Encerrar programa");
        }while(op != 'S');

    }
}
