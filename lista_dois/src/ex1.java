import java.lang.*;
import java.util.Scanner;

public class ex1 {

    public static void vogaisNaoExistentes(String frase){

        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A')
                contA++;
            if (frase.charAt(i) == 'E')
                contE++;
            if (frase.charAt(i) == 'I')
                contI++;
            if (frase.charAt(i) == 'O')
                contO++;
            if (frase.charAt(i) == 'U')
                contU++;
        }

        if(contA == 0)
            System.out.println("Não há vogal A.");
        if(contE == 0)
            System.out.println("Não há vogal E.");
        if(contI == 0)
            System.out.println("Não há vogal I.");
        if(contO == 0)
            System.out.println("Não há vogal O.");
        if(contU == 0)
            System.out.println("Não há vogal U.");
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma frase para verificação:");
        String frase = ler.nextLine();
        vogaisNaoExistentes(frase.toUpperCase());
    }
}
