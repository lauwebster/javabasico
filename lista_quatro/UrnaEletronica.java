public class UrnaEletronica {

    private int qtdCandidatos;
    private String lista;
    private int somatoria;
    private String nome;

    UrnaEletronica(int qtdCandidatos){
        setQtdCandidatos(qtdCandidatos);
        getQtdCandidatos();
    }

    public void setQtdCandidatos(int quantidade){
        this.qtdCandidatos = quantidade;
    }
    public int getQtdCandidatos(){
        return qtdCandidatos;
    }
}
