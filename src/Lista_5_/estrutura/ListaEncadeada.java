package Lista_5_.estrutura;

public class ListaEncadeada
{
    protected Elo prim;
    protected int tamanho=0;

    protected class Elo
    {
        protected int dado;
        protected Elo prox;

        public Elo()
        {
            prox = null;
        }

        public Elo(int elem)
        {
            dado = elem;
            prox = null;
        }

        public Elo(int elem, Elo proxElem)
        {
            dado = elem;
            prox = proxElem;
        }
    }

    public ListaEncadeada()
    {
        prim = null;
        tamanho = tamanho();
    }
    public boolean vazia()
    {
        return prim == null;
    }

    public void insere(int novo)
    {
        Elo p = new Elo(novo);
        p.prox = prim;
        prim = p;
        tamanho++;
    }
    public boolean busca(int elem)
    {
        Elo p;

        for(p = prim; p != null; p = p.prox)
        {
            if(p.dado == elem)
                return true;
        }

        return false;
    }

    public boolean buscaRecursiva(int elem)
    {
        if(this.vazia())
            return false;

        return buscaRecursiva(elem, prim);
    }

    private boolean buscaRecursiva(int elem, Elo p)
    {
        if(p == null)
            return false;

        if(p.dado == elem)
            return true;

        return buscaRecursiva(elem, p.prox);
    }

    public boolean remove(int elem)
    {
        Elo p;
        Elo ant = null;

        for(p = prim; ((p != null) && (p.dado != elem)); p = p.prox)
            ant = p;

        if (p == null)
            return false;

        if (p == prim)
            prim = prim.prox;
        else
            ant.prox = p.prox;

        p = null;

        tamanho--;

        return true;
    }

    public void imprime()
    {
        Elo p;

        System.out.println("Elementos da lista:");

        for(p = prim; p != null; p = p.prox)
        {
            System.out.print(p.dado + " ");
        }

        System.out.println();
    }

    public void imprimeRecursivo()
    {
        System.out.println("Elementos da lista:");

        if(this.vazia())
            return;

        imprimeRecursivo(prim);

        System.out.println();
    }

    private void imprimeRecursivo(Elo p)
    {
        if(p == null)
            return;

        System.out.print(p.dado + " ");

        imprimeRecursivo(p.prox);
    }

    public int tamanho()
    {
        int tam = 0;
        Elo p = prim;

        while(p != null)
        {
            tam++;
            p = p.prox;
        }
        return tam;
    }

    public int getTamanho()
    {
        return tamanho;
    }

    public int tamanhoRecursivo()
    {
        if(this.vazia())
            return 0;

        return tamanhoRecursivo(prim);
    }

    private int tamanhoRecursivo(Elo p)
    {
        if(p == null)
            return 0;

        return 1 + tamanhoRecursivo(p.prox);
    }

    public int max()
    {
        if(this.vazia())
            return 0;

        Elo p;
        int maior = Integer.MIN_VALUE;

        for(p = prim; p != null; p = p.prox)
        {
            if(maior < p.dado)
                maior = p.dado;
        }

        return maior;
    }

    public int maxRecursivo()
    {
        if(this.vazia())
            return 0;

        return maxRecursivo(prim);
    }

    private int maxRecursivo(Elo p)
    {
        if(p == null)
            return Integer.MIN_VALUE;

        int maior = maxRecursivo(p.prox);

        if(maior < p.dado)
            maior = p.dado;

        return maior;
    }
    public ListaEncadeada separa(int n)
    {
        ListaEncadeada l2 = new ListaEncadeada();

        Elo p;


        for(p = prim; (p != null) && (p.dado != n); p = p.prox);
        if(p == null)
            return null;

        l2.prim = p.prox;
        p.prox = null;
        return l2;
    }

    public static ListaEncadeada concatena(ListaEncadeada l1, ListaEncadeada l2)
    {
        Elo p;
        if(l1.prim == null)
            l1.prim = l2.prim;

        else
        {
            for(p = l1.prim; p.prox != null; p = p.prox);
            p.prox = l2.prim;
        }
        l2.prim = null;

        return l1;
    }

    public static ListaEncadeada constroi(int[] v, int n)
    {
        ListaEncadeada l = new ListaEncadeada();
        Elo p, ult;
        ult = null;

        for(int i = 0; i < n; i++)
        {

            p = l.new Elo(v[i]);


            if(l.prim == null)
            {
                l.prim = p;
                ult = p;
            }
            else
            {
                ult.prox = p;
                ult = p;
            }
        }

        return l;
    }

    public static ListaEncadeada intersecaoListas(ListaEncadeada l1, ListaEncadeada l2)
    {
        ListaEncadeada l3 = new ListaEncadeada();

        //pega primeiro item da segunda lista
        Elo p =l2.prim;

        //percorre a quantidade de itens da  lista 2
        for(int i =0; i<l2.tamanho; i++)
        {
            if( l1.busca(p.dado) ) //metodo de busca possui complexidade O(n), onde n=qntd de itens da lista 1
                l3.insere(p.dado);
            p=p.prox;
        }
        return l3;
    }
}