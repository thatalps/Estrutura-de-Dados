package Lista_5_.estrutura;

public class ListaDuplamente {
    /* Refer�ncia para primeiro elemento */
    protected Elo prim;

    protected int tamanho = 0;

    protected class Elo {
        protected int dado;
        protected Elo ant;
        protected Elo prox;

        public Elo() {
            ant = null;
            prox = null;
        }

        public Elo(int elem) {
            dado = elem;
            ant = null;
            prox = null;
        }

        public Elo(int elem, Elo antElem, Elo proxElem) {
            dado = elem;
            ant = antElem;
            prox = proxElem;
        }
    }

    public ListaDuplamente() {
        prim = null;
    }

    /* Testa se a lista est� vazia. */
    public boolean vazia() {
        return prim == null;
    }

    /* Insere elemento no in�cio da lista. */
    public void insere(int novo) {
        Elo p;

        p = new Elo(novo);

        p.prox = prim;

        p.ant = null;

        if (prim != null)
            prim.ant = p;

        prim = p;

        tamanho++;
    }

    private Elo busca(int elem) {
        Elo p = null;

        for (p = prim; ((p != null) && (p.dado != elem)); p = p.prox) ;

        return p;
    }

    /* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
    public boolean remove(int elem) {
        Elo p = null;
        p = busca(elem);

        if (p == null) return false;

        /* Retira primeiro elemento */
        if (p == prim)
            prim = prim.prox;
        else
            /* Retira elemento do meio */
            p.ant.prox = p.prox;

        /* Testa se � ultimo elemento */
        if (p.prox != null)
            p.prox.ant = p.ant;

        p = null;
        tamanho--;
        return true;
    }

    /* Imprime todos os elementos da lista. */
    public void imprime() {
        Elo p;

        System.out.println("Elementos da lista:");

        for (p = prim; p != null; p = p.prox)
        {
            System.out.print(p.dado + " ");
        }
        System.out.println();
    }

    /* Imprime todos os elementos da lista em ordem reversa. */
    public void imprimeReversa() {
        Elo p;
        Elo ult = null;

        System.out.println("Elementos da lista em ordem reversa:");

        p = prim;

        while (p != null) {
            ult = p;
            p = p.prox;
        }

        for (p = ult; p != null; p = p.ant) {
            System.out.print(p.dado + " ");
        }

        System.out.println();
    }

    /* Resolu��o da quest�o 4 da lista auxiliar de Lista Encadeada. */
    public static ListaDuplamente concatena(ListaDuplamente l1, ListaDuplamente l2) {
        Elo p;

        /* Verifica se a lista l1 � vazia. */
        if (l1.prim == null) {
            l1.prim = l2.prim;
        } else {
            /* Primeiramente, precisamos obter o �ltimo elo da lista l1. */
            for (p = l1.prim; p.prox != null; p = p.prox) ;

            /* Faz o "prox" do �ltimo elemento da lista l1, apontado por "p",
             * apontar para o "prim" da lista l2. */
            p.prox = l2.prim;

            /* Faz o "ant" do "prim" da lista l2 apontar para o �ltimo elemento da
             * lista l1, apontado por "p". */
            l2.prim.ant = p;
        }

        /* Nesse ponto, os elementos de l2 j� est�o encadeados ao final de l1,
         * como desejado. Assim, vamos deixar a lista l2 vazia. */
        l2.prim = null;

        return l1;
    }
    public boolean verificaIgualdade(ListaDuplamente lista2) {
        if (!lista2.vazia() && !vazia()) 
        {
            if (verificaIgualdade(prim, lista2.prim))
                return true;
            else
                return false;
        } else return false;
    }

    public boolean verificaIgualdade(ListaDuplamente.Elo p, ListaDuplamente.Elo q)
    {
        if (p.prox!=null && q.prox!=null)
        {
            if (p.dado != q.dado)
                return false;
            else {
                p = p.prox;
                q = q.prox;
                verificaIgualdade(p, q);
            }
        }
        //  caso consiga sair do looping acima sem retornar false, retorna true
        return true;
    }

    public void trocaElos(int indiceElo1, int indiceElo2)
    {
        Elo p =new Elo();
        Elo elo_aux1=prim, elo_aux2=prim;

        if(indiceElo1 < tamanho && indiceElo2 < tamanho)//indice dentro do tamanho? sim
        {
            for (int i = 0; i < indiceElo1; i++)//encontra item com primeiro indice
                elo_aux1 = elo_aux1.prox;
            for (int i = 0; i < indiceElo2; i++)//encontra item com segundo indice
                elo_aux2 = elo_aux2.prox;

            p.ant = elo_aux1.ant;
            p.prox = elo_aux1.prox;

            if(elo_aux1.prox == elo_aux2)
            {
                elo_aux1.ant = elo_aux2;
                elo_aux1.prox = elo_aux2.prox;

                elo_aux2.ant = p.ant;
                elo_aux2.prox = elo_aux1;
            }
            else if(elo_aux2.prox == elo_aux1)
            {
                elo_aux1.ant = elo_aux2.ant;
                elo_aux1.prox = elo_aux2;

                elo_aux2.ant = elo_aux1;
                elo_aux2.prox = p.prox;
            }
            else
            {
                elo_aux1.ant = elo_aux2.ant;
                elo_aux1.prox = elo_aux2.prox;

                elo_aux2.ant = p.ant;
                elo_aux2.prox = p.prox;
            }


            if(elo_aux1.prox != null)
                elo_aux1.prox.ant = elo_aux1;

            if(elo_aux2.prox != null)
                elo_aux2.prox.ant = elo_aux2;



            if(elo_aux1.ant != null)
                elo_aux1.ant.prox = elo_aux1;
            else
                prim = elo_aux1;


            if(elo_aux2.ant != null)
                elo_aux2.ant.prox = elo_aux2;
            else
                prim = elo_aux2;

        }
        else System.out.println("Não possui esses indices!");

    }

    public void insereDecrescente(int item)
    {
        Elo p, q;
        Elo ant = null;

        q = new Elo(item);// 10 5

        for (p = prim; ((p != null) && (p.dado > item)); p = p.prox)
            ant = p;


        if (ant == null)
            prim = q;
        else
            ant.prox = q;

        q.prox = p;
    }


}