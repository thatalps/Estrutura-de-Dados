package Lista_5_.estrutura;

public class ListaCircular  extends ListaEncadeada
{
    public void imprime()
    {
        Elo p;
        System.out.println("Elementos da lista");

        p = prim;

        if (p != null)
        {
            do
            {
                System.out.print(p.dado + " ");
                p = p.prox;

            } while (p != prim);
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
        System.out.print(p.dado + " ");

        if(p.prox == prim)
            return;

        imprimeRecursivo(p.prox);
    }

    public void insere(int novo)
    {
        Elo p, q;
        q = new Elo(novo);
        p = prim;
        tamanho++;
        if (p != null)
        {
            while (p.prox != prim)
            {
                p = p.prox;
            }

            p.prox = q;
            q.prox = prim;
        }
        else
        {
            prim = q;
            prim.prox = q;
        }
    }

    public boolean remove(int elem)
    {
        Elo p = null;
        Elo ant = null;

        if (prim == null) return false;

        for( p = prim; ( (p.prox != prim ) && (p.dado != elem) ); p = p.prox)
            ant = p;

        if ( p.dado == elem )
        {
            if ( p == prim )
                if ( prim == prim.prox )
                    prim = null;
                else
                {
                    for( ant = prim; ( ant.prox != prim ); ant = ant.prox);

                    ant.prox = prim.prox;
                    prim = prim.prox;
                }
            else
                ant.prox = p.prox;

            p = null;
            return true;
        }
        else
            return false;
    }
    public ListaEncadeada separa(int n)
    {
        ListaEncadeada l2 = new ListaEncadeada();

        Elo p = prim;

        do
        {
            if(p.dado == n)
                break;

            p = p.prox;

        } while (p != prim);

        if(p.dado != n)
            return null;

        l2.prim = p.prox;

        p.prox = prim;

        Elo q;
        for(q = l2.prim; q.prox != prim; q = q.prox);

        q.prox = l2.prim;

        return l2;
    }
    public ListaCircular merge(ListaCircular l2)
    {
        ListaCircular l3 = new ListaCircular();
        Elo p = this.prim, q = l2.prim;
        if(this.vazia())
        {
            return l2;
        }
        if(l2.vazia())
        {
            return this;
        }
        else
        {
            int cont=0, tamanho_total = this.getTamanho()+ l2.getTamanho();
            while (cont!=tamanho_total)
            {
                if(p!=null)
                {
                    l3.insere(p.dado);
                    p=p.prox;
                    cont++;
                }
                if(q!=null)
                {
                    l3.insere(q.dado);
                    q=q.prox;
                    cont++;
                }
            }
        }
        return l3;
    }

    public ListaCircular inverteLista()
    {
        ListaCircular l2 = new ListaCircular();
        ListaCircular l3 = new ListaCircular();
        Elo q = new Elo();
        Elo prim_aux= prim;
        boolean libera=false;

        for(int i =0; i< tamanho;i++) //percorre a quantidade de vezes que será necessario preencher a lista invertida
        {
            for(Elo p =prim_aux; ;p=p.prox)
                if(p==prim_aux && libera)
                    break;
                else
                {
                    libera=true;
                    q=p;
                }

            if(q!=null)
                l2.insere(q.dado);

            prim_aux = q;
            libera = false;
        }
        return l2;
    }
}