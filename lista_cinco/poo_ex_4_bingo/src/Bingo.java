class Bingo {

    private int valorMaximo;
    private int valorAtual;
    private int[] numerosSorteados;
    private int tl;

    public Bingo(int valorMaximo) {
        setValorMaximo(valorMaximo);
        tl = 0;
        numerosSorteados = new int[valorMaximo];
    }
    //SETS
    public void setValorMaximo(int valorMaximo) {
        if (valorMaximo > 0)
            this.valorMaximo = valorMaximo;
    }

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void setTl() {
        tl++;
    }

    public void setNumerosSorteados(int num) {
        numerosSorteados[tl] = num;
    }
    //GETS
    public int getTl() {
        return tl;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public int getValorAtual() {
        return valorAtual;
    }

    public void sorteio() {
        int numSorteado = (int) (Math.random()*valorMaximo + 1);
        verifica(numSorteado);
    }

    public void verifica(int numSorteado) {
        int i = 0;
        if(tl == 0) {
            setValorAtual(numSorteado);
            setNumerosSorteados(numSorteado);
            setTl();
        }
        else{
            while (i < tl && numSorteado != numerosSorteados[i])
                i++;
            if (numSorteado != numerosSorteados[i]){//nao achei;
                setValorAtual(numSorteado);
                setNumerosSorteados(numSorteado);
                setTl();
            }
            else
                sorteio();
        }

    }
}