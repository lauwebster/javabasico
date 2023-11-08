import java.util.Scanner;
import static java.lang.Character.toUpperCase;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculadora C = new Calculadora();

        System.out.println("Calculadora");
        System.out.println("Informe qual operação deseja fazer:");
        System.out.println("A - Soma (+)");
        System.out.println("B - Subtração (-)");
        System.out.println("C - Divisão (/)");
        System.out.println("D - Multiplicação (*)");
        System.out.println("S - Sair da calculadora");
        char op = sc.next().charAt(0);

        do{
            switch (toUpperCase(op)){
                case 'A':
                    System.out.println("Informe o primeiro número:");
                    int num1 = sc.nextInt();
                    System.out.println("Informe o segundo número:");
                    int num2 = sc.nextInt();
                    C.soma(num1, num2);
                    System.out.println("Resultado: " + C.resultado);
                    break;
                case 'B':
                    System.out.println("Informe o primeiro número:");
                    int nume1 = sc.nextInt();
                    System.out.println("Informe o segundo número:");
                    int nume2 = sc.nextInt();
                    C.subtracao(nume1, nume2);
                    System.out.println("Resultado: " + C.resultado);
                    break;
                case 'C':
                    System.out.println("Informe o primeiro número:");
                    int numero1 = sc.nextInt();
                    System.out.println("Informe o segundo número:");
                    int numero2 = sc.nextInt();
                    C.divisao(numero1, numero2);
                    System.out.println("Resultado: " + C.resultado);
                    break;
                case 'D':
                    System.out.println("Informe o primeiro número:");
                    int numero01 = sc.nextInt();
                    System.out.println("Informe o segundo número:");
                    int numero02 = sc.nextInt();
                    C.multiplicacao(numero01, numero02);
                    System.out.println("Resultado: " + C.resultado);
                    break;
            }
            System.out.println("\nCalculadora");
            System.out.println("Informe qual operação deseja fazer:");
            System.out.println("A - Soma (+)");
            System.out.println("B - Subtração (-)");
            System.out.println("C - Divisão (/)");
            System.out.println("D - Multiplicação (*)");
            System.out.println("S - Sair da calculadora");
            op = sc.next().charAt(0);
        }while(op != 'S');
    }
}