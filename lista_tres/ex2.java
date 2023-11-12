import java.util.Scanner;

public class ex2 {
    public static boolean QuadradoMagico(int[][] matriz){
        int soma=0, somaAux=0;

        for(int i=0; i < matriz[0].length; i++){
            soma += matriz[0][i];
        }

        for(int i=0; i < matriz.length; i++){
            somaAux=0;
            for(int j=0; j < matriz[i].length; j++){
                somaAux += matriz[i][j];
            }
            if(soma != somaAux){
                return false;
            }
        }

        for(int i=0; i < matriz[0].length; i++){
            somaAux=0;
            for(int j=0; j < matriz.length; j++){
                somaAux += matriz[i][j];
            }
            if(soma != somaAux){
                return false;
            }
        }

        somaAux = 0;
        for(int i=0; i < matriz.length; i++){
            somaAux += matriz[i][i];
        }
        if(soma != somaAux){
            return false;
        }

        somaAux = 0;
        int j = 0;
        for(int i = matriz.length - 1; i >= 0; i--){
            somaAux += matriz[i][j];
            j++;
        }
        if(soma != somaAux){
            return false;
        }
        return true;
    }

    public static int[][] geraMatrizQuadrada(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas da matriz:");
        int L = leitura.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz:");
        int C = leitura.nextInt();
        int matriz[][] = new int[L][C];
        System.out.println("A seguir digite numeros inteiros para preencher a matriz!");
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                System.out.printf("Matriz [%d][%d] : ", i, j);
                int num = leitura.nextInt();
                matriz[i][j] = num;
            }
        }
        return matriz;
    }
    public static void exibeMatriz(int[][] matriz){
        int L = matriz.length;
        int C = matriz[0].length;
        for(int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int matriz[][] = geraMatrizQuadrada();
        exibeMatriz(matriz);
        if(QuadradoMagico(matriz)){
            System.out.println("Matriz é um Quadrado Mágico!");
        }else{
            System.out.println("Matriz NÃO é um Quadrado Mágico!");
        }
    }
}