package Lista_1_.estrutura;

public class Pilha
{
    private int tamanho;
    private char vetor[];
    private int topo;

    public Pilha(int t)
    {
        tamanho = t;
        vetor = new char[tamanho];
        topo = -1;
    }

    public boolean estaVazia()
    {
        if(topo==-1)
            return true;
        else
            return false;
    }

    public boolean estaCheia()
    {
        if( topo == (tamanho-1) ) //se chegou no topo da pilha
            return true;
        else
            return false;
    }

    public boolean adicionaNaPilha(char i) //push
    {
        if (!this.estaCheia())
        {
            topo++;
            vetor[topo] = i;
            return true;
        }
        else
        {
            System.out.println("Pilha cheia!");
            return false;
        }
    }

    public char pegaTopo()
    {
        char elemento = ' ';

        if(!this.estaCheia())
        {
            elemento = vetor[topo];
        }
        else
        {
            System.out.println("Pilha vazia.");
        }
        return elemento;
    }

    public char retornaPrimeiroItemEapaga() //pop
    {
        char x = ' ';

        if (!this.estaVazia())
        {
            x = vetor[topo];
            topo--;
        }
        else
        {
            System.out.println("Pilha vazia!");
        }
        return x;
    }

    public int getTopo() {return topo;}
}