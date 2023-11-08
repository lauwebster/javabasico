public class Elevador {
    //atributos
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int presentes;
    private int andarDesejado;

    //constructor
    public Elevador(int totalAndares, int capacidade){
        setAndarAtual();
        setPresentes();
        setCapacidade(capacidade);
        setTotalAndares(totalAndares);
    }
    public void Entrar(){
        if(presentes == capacidade)
            System.out.println("Elevador lotado.\n");
        else{
            System.out.println("Pode entrar.\n");
            presentes++;
        }
    }
    public void subir(){
        if(this.presentes == 0)
            System.out.println("Não há pessoas no elevador\n");
        else{
            if(this.andarAtual >= this.totalAndares)
                System.out.println("Estamos no andar limite\n");
            else{
                System.out.println("Subiu um andar\n");
                andarAtual++;
            }
        }
    }
    public void descer(){
        if(presentes == 0)
            System.out.println("Não há pessoas no elevador.\n");
        else{
            if(andarAtual - 1 >= 0)
                System.out.println("Desceu um andar\n");
            else
                System.out.println("Não é possível descer.\n");
        }
    }
    public void sair(){
        if(presentes == 0)
            System.out.println("Não há pessoas no elevador.\n");
        else{
            System.out.println("Você saiu do elevador.\n");
            presentes--;
        }
    }
    //criar set
    public void setAndarAtual(){
        andarAtual = 0;
    }
    public void setTotalAndares(int totalAndares){
        if(totalAndares == 0)
            System.out.println("Número inválido\n");
        else
            this.totalAndares = totalAndares;
    }
    public void setCapacidade(int capacidade){
        if(capacidade == 0)
            System.out.println("Número inválido\n");
        else
            this.capacidade = capacidade;
    }
    public void setPresentes(){
        this.presentes = 0;
    }
    //get
    public int getAndarAtual(){

        return andarAtual;
    }
    public int getTotalAndares(){

        return totalAndares;
    }
    public int getCapacidade(){

        return capacidade;
    }
    public int getPresentes(){
        return presentes;
    }
}
