import java.util.Scanner;

public class ex7 {

    public static void coluna(String string, int colunas){
        int i=0, j=0, contpalavras=0;
        int controle=0, flag=0, cont=0, k, y;
        String stringaux= "";
        String stringteste= "";
        System.out.println("\n");
        for (i=0; i < string.length(); i++) {
            if (string.charAt(i) == 32 || i == 0) {
                j=i+1;
                while(j < string.length() && string.charAt(j) != 32)
                    j++;
                if (j >= i+1) {
                    stringteste="";
                    for (k=i; k < j; k++) {
                        stringteste += string.charAt(k);
                    }
                    stringteste=stringteste.trim();
                    stringteste+=' ';
                    if (stringaux.length()-1-controle + stringteste.length() <= colunas) {
                        stringaux += stringteste;
                    }
                    else {
                        stringaux = stringaux.substring(0, stringaux.length()-1);
                        stringaux += "\n";
                        stringaux += stringteste;
                        controle = stringaux.length()-stringteste.length();
                    }
                }
            }
        }
        stringaux = stringaux.substring(0, stringaux.length()-1);
        System.out.println(stringaux);
        System.out.println("\n");
    }
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu texto:");
        String string = ler.nextLine();
        System.out.println("Delimitador de colunas:");
        int colunas = ler.nextInt();
        coluna(string, colunas);
    }
}
