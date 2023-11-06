import java.util.Scanner;
import java.lang.Math;

public class ex5 {

    public static void verificaNotas(double valor){

        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        int moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda1 = 0;

        if(valor >= 100){
            nota100 = (int) (valor/100);
            valor = valor % 100;
        }
        if(valor >= 50){
            nota50 = (int) (valor/50);
            valor = valor % 50;
        }
        if(valor >= 20){
            nota20 = (int) (valor/20);
            valor = valor % 20;
        }
        if(valor >= 10){
            nota10 = (int) (valor/10);
            valor = valor %10;
        }
        if(valor >= 5){
            nota5 = (int) (valor/5);
            valor = valor%5;
        }
        if(valor >= 2){
            nota2 = (int) (valor/2);
            valor = valor%2;
        }
        if(valor >= 1){
            nota1 = (int) (valor/1);
            valor = nota1 % 1;
        }
        if(valor >= 0.5){
            moeda50 = (int) (valor/0.5);
            valor = valor%0.5;
        }
        if(valor >= 0.25){
            moeda25 = (int) (valor/0.25);
            valor = valor%0.25;
        }
        if(valor >= 0.10){
            moeda10 = (int) (valor/0.10);
            valor = valor%0.10;
        }
        if(valor >= 0.05){
            moeda5 = (int) (valor/0.05);
            valor = valor%0.05;
        }
        if(valor >= 0.01){
            moeda1 = (int) (valor/0.01);
            valor = valor%0.01;
        }
        if(nota100>0)
            System.out.println(nota100 + " nota (s) de cem");
        if(nota50>0)
            System.out.println(nota50 + " nota (s) de cinquenta");
        if(nota20>0)
            System.out.println(nota20 + " nota (s) de vinte");
        if(nota10>0)
            System.out.println(nota10 + " nota (s) de dez");
        if(nota5>0)
            System.out.println(nota5 + " nota (s) de cinco");
        if(nota2>0){
            System.out.println(nota2 + " nota (s) de dois");
        }
        if(nota1>0)
            System.out.println(nota1 + " moeda (s) de um real");
        if(moeda50>0)
            System.out.println(moeda50 + " moeda (s) de cinquenta centavos");
        if(moeda25>0)
            System.out.println(moeda25 + " moeda (s) de vinte e cinco centavos");
        if(moeda10>0)
            System.out.println(moeda10 + " moeda (s) de dez centavos");
        if(moeda5>0)
            System.out.println(moeda5 + " moeda (s) de cinco centavos");
        if(moeda1>0)
            System.out.println(moeda1 + " moeda (s) de um centavo");
    }
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double valor;

        System.out.println("Informe valor dado:");
        valor = ler.nextDouble();
        if (valor > 0) {
            verificaNotas(valor);
        }
        else
            System.out.println("Informe um valor válido.");
    }
}
