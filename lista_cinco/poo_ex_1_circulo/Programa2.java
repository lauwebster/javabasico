
public class Programa2 {
    public static void main (String [] arg){
        Circulo c1 = new Circulo (1,2,100);
        Circulo c2 = new Circulo (20,22, 99);
        Circulo c3 = new Circulo (1,2,100);
        if (c1.comparaCirculo(c2))
            System.out.println("c1 igual a c2");
        else
        if (c1.comparaCirculo(c3))
            System.out.println("c1 igual a c3");
    }
}
