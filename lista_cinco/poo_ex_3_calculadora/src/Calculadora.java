public class Calculadora {

    private int numero1;
    private int numero2;
    int resultado;

    public int soma(int num1, int num2){
        resultado = num1 + num2;
        return resultado;
    }
    public int subtracao(int num1, int num2){
        resultado = num1 - num2;
        return resultado;
    }
    public int divisao(int num1, int num2){
        resultado = (num1/num2);
        return resultado;
    }
    public int multiplicacao(int num1, int num2){
        resultado = num1 * num2;
        return resultado;
    }
}
