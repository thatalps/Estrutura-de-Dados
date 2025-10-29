package Lista_4_.estrutura;

public class Inimigo
{
    private int vida;
    private double danoPorSegundo;
    private String nome="";

    public Inimigo(int vida, double danoPorSegundo, String nome)
    {
        setVida(vida);
        setDanoPorSegundo(danoPorSegundo);
        setNome(nome);
    }
    public void setVida(int vida)
    {
        this.vida=vida;
    };
    public int getVida()
    {
        return vida;
    }
    public void setDanoPorSegundo(double danoPorSegundo)
    {
        this.danoPorSegundo= danoPorSegundo;
    }
    public double getDanoPorSegundo()
    {
        return danoPorSegundo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
