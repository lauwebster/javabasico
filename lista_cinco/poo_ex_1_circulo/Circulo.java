public class Circulo {

    private int centroX;
    private int centroY;
    private int raio;

    public Circulo(int centroX, int centroY, int raio) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }
    public void move(int centroX, int centroY, int raio){
        setCentroX(centroX);
        setCentroY(centroY);
        setRaio(raio);
    }
    public double area(){
        double areaCirculo = Math.PI * (this.raio * this.raio);
        return areaCirculo;
    }
    public double perimetro(){
        double perimetroCirculo = (2 * Math.PI * this.raio);
        return perimetroCirculo;
    }
    public int getCentroX(){
        return centroX;
    }
    public int getCentroY() {

        return centroY;
    }
    public int getRaio(){
        return raio;
    }
    public boolean comparaCirculo(Circulo A){
        if(A.centroX == this.centroX && A.centroY == this.centroY && A.raio == this.raio)
            return true;
        else
            return false;
    }
    public void setCentroX(int centroX){
        if(centroX == 0)
            System.out.println("Valor inválido.");
        else
            this.centroX = centroX;
    }
    public void setCentroY(int centroY){
        if(centroY == 0)
            System.out.println("Valor inválido.");
        else
            this.centroY = centroY;
    }
    public void setRaio(int raio){
        if(raio == 0)
            System.out.println("Valor inválido.");
        else
            this.raio = raio;
    }
}
