import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.RandomAccess;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        try {
            RandomAccessFile arq;
            arq = new RandomAccessFile("palavras.txt", "r");
            System.out.println("Arquivo aberto.");
            System.out.println("Tamanho do arquivo: " + arq.length());
            System.out.println("Informe o nome que deseja buscar:");
            String nome = sc.nextLine(); //recebo o nome
            String linha = arq.readLine(); //leio uma linha do arquivo
            while(arq.getFilePointer() < arq.length() && !linha.contains(nome)) {
                linha = arq.readLine();
                i++;
            }
            if(linha.contains(nome)){
                System.out.println("Nome localizado:");
                System.out.println("Nome: " + nome);
                System.out.println("Na linha: " + i);
            }
            else
                System.out.println("Não encontrado!");
            arq.close();
        }
        catch(IOException e){
            System.out.println("Erro!");
        }
    }
}
