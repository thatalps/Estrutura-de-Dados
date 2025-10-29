package Lista_2_.estrutura;

import java.util.Vector;

public class FilaGenerica<T>
{
    protected int tamanho;
    protected Vector<T> vetor;
    protected int ini;
    protected int n;

    public FilaGenerica(int tam)
    {
        tamanho = tam;
        vetor = new Vector<>(tamanho);
        ini = 0;
        n = 0;
    }

    public boolean isVazia()
    {
        return (n == 0);
    }

    public boolean isCheia()
    {
        return (n == tamanho);
    }

    public T remove()
    {
        T elemento = null;

        if (!this.isVazia())
        {
            elemento = vetor.get(ini);
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    public boolean insere(T elemento)
    {
        int fim;

        if ( !isCheia() ) {
            fim = (ini+n) % tamanho;
            vetor.add(fim, elemento);
            n++;
            return true;
        } else
            return false;
    }
}
