import java.util.*;

public class ex5 {

    public class Exercicio5 {
        public static void geraAposta(int [][]apostas){
            int quantdJogos = apostas.length;
            int quantdApostas = apostas[0].length;

            for (int i = 0; i < quantdJogos; i++) {
                Random rand = new Random();
                int num = apostas[i][1];
                int [] jogos = new int[num];

                for (int j = 0; j < quantdApostas; ) {
                    int novoNumero = rand.nextInt(60) + 1;
                    if (jogos[j] != novoNumero) {
                        apostas[i][1] = jogos[j];
                        j++;
                    }
                }
            }
        }

        public static int[] geraMegaSena(){
            int[] numerosSorteados = new int[6];
            int novoNumero, primeiroDigito, segundoDigito;
            Random rand = new Random();

            for (int i = 0; i < 6; ) {
                primeiroDigito = rand.nextInt(6);
                segundoDigito = rand.nextInt(10);

                if(primeiroDigito == 0 && segundoDigito == 0) {
                    novoNumero = 60;
                }else{
                    novoNumero = (primeiroDigito * 10) + segundoDigito;
                }

                for(int j=0; j<6;j++){
                    int k=0;
                    while(k<6 && numerosSorteados[k] != novoNumero){
                        k++;
                    }
                    if(k==6){
                        numerosSorteados[i] = novoNumero;
                        i++;
                    }
                }

            }
            return numerosSorteados;
        }

        public static int[] verificaAposta(int aposta[][],int megasena[]){
            int quantdJogos = aposta.length;
            int [] acertos = new int[quantdJogos];
            List<int[]> lista = Arrays.asList(megasena);
            for (int i = 0; i < quantdJogos; i++) {
                if(lista.contains(aposta[i][1])){
                    acertos[i]=aposta[i][1];
                }else{
                    acertos[i]=0;
                }
            }
            return acertos;
        }
    }
}