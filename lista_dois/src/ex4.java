import java.util.Scanner;

public class ex4 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int palavras = 0, caracteres = 0;

        System.out.println("Digite seu texto:");
        String texto = ler.nextLine();
        String[] separador = texto.split(" ");
        int contador = texto.length() - separador.length;
        System.out.println("Quantidade de palavras: " + separador.length);
        System.out.println("A String que você criou tem " + contador + " caracteres, sem espaços");
    }
}

