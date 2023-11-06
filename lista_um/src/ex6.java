import java.util.Scanner;

public class ex6 {

    public static void sistemaPrice(int parcela, double juros, double emprestimo){

        double jurosTotal;
        jurosTotal = (emprestimo * juros)/100;
        double contaParcela;
        double contadorJuros = 0;
        contaParcela = emprestimo * ((juros/100 * Math.pow(1 + juros/100,parcela))/(Math.pow(1+juros/100,parcela) -1 ));

        for(int i=1; i< parcela+1; i++){
            contadorJuros += (emprestimo * juros)/100;
            emprestimo = emprestimo - (contaParcela - (emprestimo * juros)/100);
            System.out.printf("Nº %d...........%.2f............%.2f...........%.2f.........%.2f\n",i,contaParcela,(contaParcela - (emprestimo * juros)/100),(emprestimo * juros)/100,emprestimo);
        }
        System.out.printf("Soma total de juros: %.2f",contadorJuros);
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double jurosTotal;

        System.out.println("Sistema PRICE de amortização");
        System.out.println("Informe a parcela:");
        int parcela = ler.nextInt();
        System.out.println("Informe o juros:");
        double juros = ler.nextDouble();
        System.out.println("Informe o valor do seu empréstimo:");
        double valorEmprestimo =  ler.nextDouble();

        sistemaPrice(parcela, juros, valorEmprestimo);
    }
}
