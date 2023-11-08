public class ex2 {

    public static void main(String[] args){
        int i = 0, j = 0, TAMPALAVRA = 0;
        int vogal = 0, consoante = 97, flag = 0;
        char vogalchar, consoantechar;
        String palavra = "";

        System.out.println("Gerando cinco nomes aleatórios");
        while (i < 5){
            j = 0;
            TAMPALAVRA=0;
            while(TAMPALAVRA != 4 && TAMPALAVRA != 6 && TAMPALAVRA != 8)
                TAMPALAVRA = (int) (Math.random()*8)+4;
            while (j < TAMPALAVRA) {
                consoante = 97;
                while(consoante <= 97 || consoante >= 122 || consoante == 101 || consoante == 105 || consoante == 111 || consoante == 117) {
                    consoante = (int) (Math.random()*122)+97;
                }
                vogal=98;
                while (vogal != 97 && vogal != 101 && vogal != 105 && vogal != 111 && vogal != 117){
                    vogal = (int) (Math.random()*122)+97;
                }
                consoantechar = (char) consoante;
                vogalchar = (char) vogal;
                palavra = palavra + consoantechar;
                palavra += vogalchar;
                j += 2;
            }
            System.out.printf("Palavra %d = %s\n", i+1, palavra);
            palavra = "";
            i++;
        }
    }
}
