public class Serie {

    private String nome;
    private int ano;
    private int rating;

    public Serie(String nome, int ano, int rating){
        setNome(nome);
        setAno(ano);
        setRating(rating);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setRating(int rating){
        this.rating = rating;
    }
    public String getNome(){
        return nome;
    }
    public int getAno(){
        return ano;
    }
    public int getRating(){
        return rating;
    }
}
