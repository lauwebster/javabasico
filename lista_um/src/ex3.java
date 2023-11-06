import java.time.LocalDate;
import java.util.Scanner;

public class ex3 {

    public static boolean ValidarData(int dia, int mes, int ano){
        if(dia <= 0 || dia > 31)
            return false;
        else if(mes <= 0 || mes > 12)
            return false;
        else if(ano <= 1899 || ano > LocalDate.now().getYear())
            return false;
        return true;
    }

    public static String idade(int dia, int mes, int ano){

        int mesAtual = LocalDate.now().getMonthValue();
        int diaAtual = LocalDate.now().getDayOfMonth();
        int anoAtual = LocalDate.now().getYear();

        if(mesAtual > mes)
            return "Você fez " + (anoAtual - ano) + " anos.";
        if(mes > mesAtual)
            return "Você irá fazer " + (anoAtual - ano) + " anos.";
        if(mes == mesAtual) {
            if (diaAtual == dia)
                return "Hoje você completa " + (anoAtual - ano) + " anos. Feliz aniversário!";
            if (dia > diaAtual)
                return "Você irá fazer " + (anoAtual - ano) + " anos.";
            if (diaAtual > dia)
                return "Você fez " + (anoAtual - ano) + " anos.";
        }
        return null;
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        int dia, mes, ano;

        System.out.println("Dia do aniversário:");
        dia = leitura.nextInt();
        System.out.println("Mês:");
        mes = leitura.nextInt();
        System.out.println("Ano:");
        ano = leitura.nextInt();
        if(ValidarData(dia, mes, ano) == false) {
            System.out.println("Informe datas corretas.");
        }
        else {
            System.out.println(idade(dia, mes, ano));
        }
    }
}
