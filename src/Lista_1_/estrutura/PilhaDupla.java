package Lista_1_.estrutura;

public class PilhaDupla
{
    public int n;
    public char[] vetor;
    public int topo1, topo2;

    public PilhaDupla()
    {
        n = 10;
        vetor = new char[n];
        topo1 = -1;
        topo2 = n;
    }
    public PilhaDupla(int t)
    {
        n = t;
        vetor = new char[n];
        topo1 = -1;
        topo2 = n;
    }
    public boolean estaVazia()
    {
        if(estaVaziaPilha1() && estaVaziaPilha2())
            return true;
        else
            return  false;
    }

    public boolean estaVaziaPilha1()
    {
        if(topo1 == -1)
            return true;
        else
            return  false;
    }

    public boolean estaVaziaPilha2()
    {
        if(topo2 == n)
            return true;
        else
            return  false;
    }

    public boolean estaCheia()
    {
        if(topo1 == topo2 - 1)
            return true;
        else
            return false;
    }

    public void inserePilha1(char letra)
    {
        if(estaCheia())
            System.out.println("Pilha 1 está cheia");
        else
            this.vetor[++topo1] = letra;
    }
    public void inserePilha2(char letra)
    {
        if(estaCheia())
            System.out.println("Pilha 2 está cheia");
        else
            this.vetor[--topo2] = letra;
    }

    public char retiraPilha1()
    {
        char valorTopo = 0;
        if(estaVaziaPilha1())
            System.out.println("Pilha 1 está vazia!");
        else
            valorTopo = vetor[topo1--];

        return valorTopo;
    }
    public char retiraPilha2()
    {
        char valorTopo = 0;
        if(estaVaziaPilha2())
            System.out.println("Pilha 2 está vazia!");
        else
            valorTopo = vetor[topo2++];

        return valorTopo;
    }
    public void printaVetor()
    {
        System.out.println(vetor);
    }
}