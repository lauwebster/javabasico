import javax.swing.*;
import java.util.Scanner;

public class ex3 {

    public static int lerInt(String titulo, String mensagem){

        String idade = JOptionPane.showInputDialog(titulo, mensagem);
        try {
            int valor = Integer.parseInt(idade);
            return 1;
        }
        catch (Exception e ) {
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        if(lerInt("Atenção","Digite a sua idade:") == 1)
            System.out.println("Idade válida.");
        else
            System.out.println("Idade inválida");
    }
}
