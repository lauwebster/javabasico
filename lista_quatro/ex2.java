import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.RandomAccess;
import java.io.RandomAccessFile;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            RandomAccessFile arq;
            arq = new RandomAccessFile("frases.txt", "rw");

            for(int i = 0; i < arq.length(); i++){
                System.out.println("Frase digitada: " + arq.readLine());
            }
            System.out.println("Informe a frase para computar:");
            String frase = sc.nextLine();
            arq.writeBytes(frase);
            arq.writeChars("\n");
            System.out.println("Informe a nova frase para computar:");
            frase = sc.nextLine();
            arq.close();
        }
        catch(IOException e){
            System.out.println("Erro de abertura! " + e.toString());
        }
    }
}
