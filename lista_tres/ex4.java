import java.util.Scanner;

public class ex4 {

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
            exibirVetores(matriz,L,C);
        }

        public static void exibirVetores(int matriz[][], int L, int C){
            int par=0, impar=0, k=0, h=0, num;
            int [] vetorP = new int[L*C];
            int [] vetorI = new int[L*C];
            for(int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    if(matriz[i][j] % 2 == 0){
                        num = matriz[i][j];
                        vetorP[k] = num;
                        k++;
                        par++;
                    }else{
                        num = matriz[i][j];
                        vetorI[h] = num;
                        h++;
                        impar++;
                    }
                }
            }

            System.out.print("Vetor de Pares:   ");
            for(int i=0; i < k; i++){
                num = vetorP[i];
                System.out.print("["+num+"]");
            }
            System.out.println();
            System.out.print("Vetor de Impares: ");
            for(int i=0; i < h; i++){
                num = vetorI[i];
                System.out.print("["+num+"]");!
            }
            System.out.println();
        }


        public static void main(String[] args){
            LxC();
        }
}
