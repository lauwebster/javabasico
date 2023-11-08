import java.util.Scanner;

public class ex5 {
    public static boolean lerPlaca() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua placa:");
        String placa = ler.nextLine();

        try {
            if (placa.charAt(0) >= 65 && placa.charAt(0) <= 90 && placa.charAt(1) >= 65 && placa.charAt(1) <= 90)
                if (placa.charAt(2) >= 65 && placa.charAt(2) <= 90)
                    if (placa.charAt(3) >= 48 && placa.charAt(3) <= 57)
                        if (placa.charAt(4) >= 65 && placa.charAt(4) <= 90 || placa.charAt(4) >= 48 && placa.charAt(4) <= 90)
                            if (placa.charAt(5) >= 48 && placa.charAt(5) <= 57 && placa.charAt(6) >= 48 && placa.charAt(6) <= 57) {
                                return true;
                            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Verificando placa");

        if (lerPlaca() == true)
            System.out.println("Placa válida.");
        else
            System.out.println("Placa inválida\n");

    }
}