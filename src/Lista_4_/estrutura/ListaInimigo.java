package Lista_4_.estrutura;

public class ListaInimigo
{
    public class Elo<Inimigo>
    {
        protected Inimigo dado;
        protected Elo prox;

        public Elo(Inimigo dado)
        {
            this.dado = dado;
            this.prox = null;
        }
        public Elo(Inimigo dado, Elo prox)
        {
            this.dado = dado;
            this.prox = prox;
        }
    }

    public Elo prim;
    private Elo elo;
    int tamanho = 0;

    public void ListaInimigo()
    {
        this.prim = null;
    }
    public boolean isVazia()
    {
        if(prim == null)
            return true;
        else
            return false;
    }

    public void removeInimigo(Inimigo i)
    {
        if(prim.dado == i)
            prim = prim.prox;

        for(Elo p = prim; p != null; p = p.prox)
        {
            if(p.prox.dado == i)
                p.prox = p.prox.prox;
        }
    }
    public void inserirInimigo(Inimigo i)
    {
        if(isVazia())
            elo = new Elo<>(i);
        else
            elo = new Elo<>(i, prim);

        tamanho++;
        prim = elo;
    }

    public Inimigo localizarInimigo(Inimigo i)
    {
        for(Elo p = prim; p != null; p = p.prox)
            if(p.dado == i)
                return i;

        return null;
    }

    public int efetuarDanoInimigo(Inimigo i, int dano)
    {
        if(   (i.getVida() - dano) >= 0  )
        {
            System.out.println("Inimigo:"+ i.getNome()+ "\nVida: " + (i.getVida() - dano) );
            i.setVida(    (i.getVida() - dano)   );
            return (i.getVida() - dano);
        } else
        {
            System.out.println("Inimigo "+ i.getNome() + " perdeu.");
            removeInimigo(i);
        }
        return 0;
    }

    public void imprimirInimigos(){
        if(!isVazia())
        {
            System.out.println("Inimigos");

            for(Elo p = prim; p != null; p = p.prox)
            {
                Inimigo i =  (Inimigo) p.dado;
                System.out.println("\nNome: " + i.getNome() + "\nVida: " + i.getVida());
            }
        }
    }
}