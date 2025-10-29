package Lista_2_.estrutura;

public class Fila
{
    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;	/* Tamanho do vetor */
    protected int[] vetor;	/* Vetor de elementos */
    protected int ini;	/* Posicao do proximo elemento a ser retirado */
    protected int n;	/* Numero de elementos na fila */

    public Fila(int tam)
    {
        tamanho = tam;
        vetor = new int[tamanho];
        ini = 0;
        n = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean vazia()
    {
        return (n == 0);
    }

    public boolean cheia()
    {
        return (n == tamanho);
    }

    //Retiramos o elemento do in�cio da fila
    public int remove()
    {
        int elemento = Integer.MIN_VALUE;

        if (!this.vazia())
        {
            elemento = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(int elemento)
    {
        int fim;

        if ( !cheia() ) {
            fim = (ini + n) % tamanho;
            vetor[fim] = elemento;
            n++;
            return true;
        }
        else
            return false;
    }

    public void imprime()
    {
        for(int i =ini;i<n+ini;i++)
        {
            System.out.println( " - "+ vetor[i]);
        }
    }

    public void combinaFilas(Fila f1, Fila f2)
    {
        Fila filaMista = new Fila( f1.getTamanho() + f2.getTamanho() );

        if(f1.getTamanho()== f2.getTamanho() )
            do {
                filaMista.insere(f1.remove());
                filaMista.insere(f2.remove());
            }while (!f1.vazia());
        else
            System.out.println("Filas não possuem mesmo tamanho!");
        filaMista.imprime();
    }

    public static FilaDupla FilaCircular(Fila fila)
    {
        FilaDupla fd = new FilaDupla(fila.getTamanho());

        while(!fila.vazia())
            fd.insereInicio(fila.remove());

        return fd;
    }

}