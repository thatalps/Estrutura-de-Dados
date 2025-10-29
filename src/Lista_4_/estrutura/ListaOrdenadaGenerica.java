package Lista_4_.estrutura;

public class ListaOrdenadaGenerica<T>
{
    public class Elo<T>
    {
        protected T dado;
        protected Elo<T> prox;

        public Elo(T dado)
        {
            this.dado = dado;
            this.prox = null;
        }
        public Elo(T dado, Elo prox)
        {
            this.dado = dado;
            this.prox = prox;
        }
    }
    //////////////////////////// class lista ordenada generica
    public Elo prim;
    private Elo<T> elo;
    int tamanho = 0;

    String Path ="";

    public ListaOrdenadaGenerica()
    {
        this.prim = null;
    }
    public boolean vazia()
    { // ve se a lista está vazia
        if(tamanho == 0)
            return true;
        else return false;
    }

    public void insere(T elem) //insere elemento no final
    {
        if(vazia())
        {
            prim = new Elo<>(elem);
        }
        else
        {

            Elo p = new Elo(elem);
            p.prox = prim;
            prim = p;
            elo = new Elo<>(elem, prim);
        }
        tamanho++;

    }

    public void insereOrdenada( T elem)
    {
        Elo p, q;
        Elo ant = null;

        q = new Elo(elem);
        tamanho++;
        for (p = prim; ((p != null) && (   (p.dado.toString().compareTo(elem.toString())<0)  )); p = p.prox)
            ant = p;

        if (ant == null)
            prim = q;
        else
            ant.prox = q;

        q.prox = p;
    }

    public void imprimeAoContrario()
    {
        Elo p;
        ListaOrdenadaGenerica l1 = new ListaOrdenadaGenerica();
        String aux= "";
        System.out.println("Elementos da lista ao contrário:");

        //joga pra lista
        for(p = prim; p != null; p = p.prox)
        {
            l1.insere(p.dado);
        }

        //imprime a lista corretamente
        p = l1.prim;
        for (int i =0; i < l1.tamanho();i++)
        {
            aux+=p.dado+" ";
            p = p.prox;
        }
        System.out.println(aux);

    }

    public void imprime()
    {
        Elo p;
        String aux="";

        System.out.println("Elementos da lista:");

        for(p = prim; p != null; p = p.prox)
        {
            aux+= p.dado + " ";
        }
        System.out.println(aux);
    }

    public int getTamanho() {
        return tamanho;
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
    public void inverteLetrasPalavras()
    {
        Elo p;
        ListaOrdenadaGenerica l1 = new ListaOrdenadaGenerica();
        ListaOrdenadaGenerica l2 = new ListaOrdenadaGenerica();
        String aux= "";

        //joga pra lista
        for(p = prim; p != null; p = p.prox)
        {
            aux= p.dado.toString();
            l1.insere(" ");
            for (int i =0; i<aux.length(); i++)
            {
                l1.insere(aux.charAt(i));
            }
            l2.insere(l1);
        }

        //imprime a lista corretamente
        p = l1.prim;
        aux="";
        for (int i =0; i < l1.tamanho();i++)
        {
            aux+=p.dado;
            p = p.prox;
        }
        System.out.println("Elementos com palavras e letras invertidas:\n" + aux);
    }


    @Override
    public String toString()
    {
        ListaOrdenadaGenerica l1 = new ListaOrdenadaGenerica();
        String aux ="";
        //joga pra lista
        for(Elo p = prim; p != null; p = p.prox)
            l1.insere(p.dado);

        Path="";
        for(Elo p = l1.prim; p != null; p = p.prox)
        {
            if (p.dado.toString().contains("Pasta") && p.dado.toString().contains("*") )
            {
                p.dado = p.dado.toString().replace("Pasta ", "");
                p.dado = p.dado.toString().replace("*", "");
                Path += "\n\t" + p.dado + '\n';
            }
            else if (p.dado.toString().contains("Pasta"))
            {
                p.dado = p.dado.toString().replace("Pasta ", "");

                Path += "\n" + p.dado + '\n';
            }
            else
                Path += "\t" + p.dado + "\n";
        }
        return Path;
    }

    public void GeraStringPath()
    {
        if(!vazia())
        {
            // copia o primeiro elemento e faz um for nele
            for(Elo p = prim; p != null; p = p.prox) // jogos e faculdade
            {
                if(p.dado instanceof ListaOrdenadaGenerica)
                    GeraStringPath( (ListaOrdenadaGenerica) p.dado);
                else if(p.dado!=null && p.dado!="")
                    Path+=p.dado + "\n";
                else Path+="(Pasta vazia)";
            }
        }
        else
            System.out.println("Diretório vazio!");
    }

    public void GeraStringPath(ListaOrdenadaGenerica q)
    {
        if(!vazia())
        {
            // copia o primeiro elemento e faz um for nele
            for(Elo p = q.prim; p != null; p = p.prox)
            {
                if(p.dado instanceof ListaOrdenadaGenerica)
                {
                    GeraStringPath( (ListaOrdenadaGenerica) p.dado);
                }
                else if(p.dado!=null && p.dado!="")
                    Path+=p.dado+" ";
                else if(p.dado.toString().contains("Pasta"))
                    Path+=p.dado+"* ";
                else Path+="(Pasta vazia)";
            }
        }
        else
            System.out.println("Pasta vazia!");

    }






}