import java.util.Scanner;

public class ex3 {
    public static void LxC(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas da matriz:");
        int L = leitura.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz:");
        int C = leitura.nextInt();
        geraMatriz(L,C);
    }

    public static void geraMatriz(int L, int C){
        int matriz[][] = new int[L][C];
        completaMatriz(matriz,L,C);
    }

    public static void completaMatriz(int matriz[][], int L, int C){
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        exibirPorcent(matriz,L,C);
    }

    public static void exibirPorcent(int matriz[][], int L, int C){
        int par=0, impar=0;
        for(int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if(matriz[i][j] % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
            }
            double porcentPar = (par * 100.0) / C;
            double porcentImpar = (impar * 100.0) / C;
            System.out.println("Linha ["+i+"]: "+ porcentPar +"% de pares - "+ porcentImpar+"% de impares.");
            par=0;
            impar=0;
        }
    }

    public static void main(String[] args){
        LxC();
    }
}
