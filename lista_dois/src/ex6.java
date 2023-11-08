import java.util.Scanner;

public class ex6 {

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        String resultado = "";
        System.out.println("Concatenação dos primeiros caracteres de palavras");
        System.out.println("Informe a frase:");
        String frase = leitura.nextLine().toUpperCase();

        for (int i=0; i < frase.length()-1; i++)
        {
            if (i == 0 && frase.charAt(i) >= 65 && frase.charAt(i) <= 90)
                resultado = resultado + frase.charAt(i);
            if (frase.charAt(i) == 32 && frase.charAt(i+1) >= 65 && frase.charAt(i+1) <= 90)
                resultado = resultado + frase.charAt(i+1);
        }
        System.out.println("Resultado: " + resultado);
    }
}
