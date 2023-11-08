import java.util.Scanner;

public class ex1 {

    public static void decomposicao(){
        Scanner leitura = new Scanner(System.in);

        int num = leitura.nextInt();
        int conta;
        char[] convertido = new char[999];

        String converter = Integer.toString(num);
        for(int i=0; i < converter.length(); i++){
            convertido[i] = converter.charAt(i);
        }

        for(int j=0; j < converter.length(); j++)
            System.out.println("Vetor na posição: " + j +" e seu valor: "+ convertido[j]);
    }
    public static void main(String[] args) {
        System.out.println("Decomposição de inteiro em vetor");
        decomposicao();
    }
}
