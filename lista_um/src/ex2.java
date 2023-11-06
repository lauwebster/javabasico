import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class ex2 {

    public static int soma(int numero){
        int soma = 0, contaDigitos = 0, aux = 0;

        aux = numero;
        while(aux != 0){
            aux = aux/10;
            contaDigitos = contaDigitos + 1;
        }

        for(int i = 0; i <= contaDigitos; i++) {
            soma = soma + numero%10;
            numero = numero/10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();

        System.out.println("Número aleatório gerado:");
        int numero = aleatorio.nextInt(9999);
        System.out.println(numero);
        System.out.println("Soma de seus dígitos: " + soma(numero));
    }
}
