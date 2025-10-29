package Lista_6_.estrutura;

import Lista_6_.MainEx2;
import Lista_6_.MainEx5;

import java.util.NoSuchElementException;

public class ArvoreBinariaBusca<Chave extends Comparable<Chave>, Valor>
{
    private No raiz;
    int min_dist=0;
    int max_dist=0;
    String comum="";
    int comum_quant=0;

    public class No
    {
        private Chave chave;
        private Valor valor;
        private No esq, dir;

        public No(Chave chave, Valor valor)
        {
            this.chave = chave;
            this.valor = valor;
            this.esq = null;
            this.dir = null;
        }

        public No(Chave chave, Valor valor, No esq, No dir)
        {
            this.chave = chave;
            this.valor = valor;
            this.esq = esq;
            this.dir = dir;
        }
    }

    public ArvoreBinariaBusca()
    {
        raiz = null;
    }
    public boolean vazia()
    {
        return (raiz == null);
    }
    public void mostra()
    {
        mostra(raiz);
    }
    private void mostra(No x)
    {
        if(x == null)
            return;

        System.out.print("[ ");

        mostra(x.esq);
        System.out.print(" <" + x.chave + "> ");
        mostra(x.dir);

        System.out.print(" ]");
    }
    public Chave min()
    {
        if(vazia())
            throw new NoSuchElementException("Arvore está vazia!");

        return min(raiz).chave;
    }
    private No min(No x)
    {
        if (x.esq == null)
            return x;
        else
        {
            min_dist++;
            return min(x.esq);
        }

    }
    public Chave max() {
        if(vazia())
            throw new NoSuchElementException("A árvore está vazia!");

        return max(raiz).chave;
    }
    private No max(No x) {
        if (x.dir == null)
            return x;
        else
        {
            max_dist++;
            return max(x.dir);
        }
    }
    public int tamanho() {return tamanho(raiz);}
    private int tamanho(No x)
    {
        if(x == null)
            return 0;

        /* Chamada recursiva para sub�rvores esquerda e direita. */
        return 1 + tamanho(x.esq) + tamanho(x.dir);
    }
    public int altura() {return altura(raiz);}
    private int altura(No x)
    {
        if(x == null)
            return -1;

        int maxAltura = Math.max(altura(x.esq), altura(x.dir));

        return 1 + maxAltura;
    }
    public boolean contem(Chave chave) {
        if (chave == null)
            throw new IllegalArgumentException("A chave fornecida é null!");

        return get(chave) != null;
    }
    public Valor get(Chave chave)
    {
        return get(raiz, chave);
    }
    private Valor get(No x, Chave chave)
    {
        if(chave == null)
            throw new IllegalArgumentException("A chave fornecida é null!");

        /* A chave n�o se encontra na �rvore. */
        if(x == null)
            return null;

        int cmp = chave.compareTo(x.chave);
        comum+=x.chave+" ";
        if(cmp < 0) /* Deve-se ir para a esquerda. */
            return get(x.esq, chave);
        else if(cmp > 0) /* Deve-se ir para a direita. */
            return get(x.dir, chave);
        else
            return x.valor;
    }
    public No getNo(Chave chave)
    {
        return getNo(raiz, chave);
    }
    private No getNo(No x, Chave chave)
    {
        if(chave == null)
            throw new IllegalArgumentException("A chave fornecida é null!");

        /* A chave n�o se encontra na �rvore. */
        if(x == null)
            return null;

        int cmp = chave.compareTo(x.chave);
        comum+=x.chave+" ";
        comum_quant++;
        if(cmp < 0) /* Deve-se ir para a esquerda. */
            return getNo(x.esq, chave);
        else if(cmp > 0) /* Deve-se ir para a direita. */
            return getNo(x.dir, chave);
        else
            return x;
    }
    public void put(Chave chave, Valor valor)
    {
        if(chave == null)
            throw new IllegalArgumentException("A chave fornecida é null!");

        if(valor == null) {
            delete(chave);
            return;
        }

        raiz = put(raiz, chave, valor);
    }
    private No put(No x, Chave chave, Valor valor)
    {
        /* Caso base: encontrou a posi��o de inser��o. */
        if (x == null)
            return new No(chave, valor);

        int cmp = chave.compareTo(x.chave);

        if(cmp < 0) /* Deve-se ir para a esquerda. */
            x.esq = put(x.esq, chave, valor);
        else if(cmp > 0) /* Deve-se ir para a direita. */
            x.dir = put(x.dir, chave, valor);
        else /* Caso tenha encontrado n� de mesma chave. */
            x.valor = valor;

        return x;
    }
    private No deleteMin(No x)
    {
        /* Caso n�o haja filho � esquerda, o n� corrente possui a menor chave. */
        if(x.esq == null)
            return x.dir;

        x.esq = deleteMin(x.esq);

        return x;
    }
    public void deleteMax()
    {
        if(vazia())
            throw new NoSuchElementException("A �rvore está vazia!");

        raiz = deleteMax(raiz);
    }
    private No deleteMax(No x)
    {
        if(x.dir == null)
            return x.esq;

        x.dir = deleteMax(x.dir);

        return x;
    }
    public void delete(Chave chave)
    {
        raiz = delete(raiz, chave);
    }
    private No delete(No x, Chave chave)
    {
        if (x == null)
            return null;

        int cmp = chave.compareTo(x.chave);

        if(cmp < 0)
            x.esq = delete(x.esq, chave);
        else if(cmp > 0)
            x.dir = delete(x.dir, chave);
        else
        {
            if(x.dir == null)
                return x.esq;
            if(x.esq  == null)
                return x.dir;

            No t = x;

            /* Pega o menor da subarvore direita (mais a esquerda). */
            x = min(t.dir);

            /* Remove o menor. */
            x.dir = deleteMin(t.dir);

            /* A subarvore esquerda se mantem a mesma. */
            x.esq = t.esq;
        }

        return x;
    }
    private No piso(No x, Chave chave)
    {
        if (x == null)
            return null;

        int cmp = chave.compareTo(x.chave);

        if (cmp == 0)
            return x;

        if (cmp <  0)
            return piso(x.esq, chave);

        No t = piso(x.dir, chave);

        if (t != null)
            return t;
        else
            return x;
    }
    private No topo(No x, Chave chave)
    {
        if (x == null)
            return null;

        int cmp = chave.compareTo(x.chave);

        if (cmp == 0)
            return x;

        if (cmp < 0)
        {
            No t = topo(x.esq, chave);

            if (t != null)
                return t;
            else
                return x;
        }

        return topo(x.dir, chave);
    }
    public void constroiArvore(int[] vetor)
    {
        for(int i =0;i<vetor.length;i++)
        {
           MainEx2.preenche(this, vetor[i], "valor"+i);
        }
    }
    public boolean eSimilar(ArvoreBinariaBusca arvore)
    {
        if(this.vazia() && arvore.vazia())
            return true;
        else
        {
            if(arvore.tamanho(arvore.raiz.esq) == this.tamanho(this.raiz.esq) && arvore.tamanho(arvore.raiz.dir) == this.tamanho(this.raiz.dir))
                return true;
            else
                return false;
        }
    }
    public boolean removeForaIntervalo(Chave chaveMin, Chave chaveMax)
    {
        if( raiz == null)
            return false;
        int tamanhoOriginal = tamanho();
        removeForaIntervalo(raiz, chaveMin, chaveMax);
        int tamanhoModificado = tamanho();

        if(tamanhoOriginal!=tamanhoModificado)
        return true;
        else return false;
    }
    public boolean removeForaIntervalo(No no,Chave min, Chave max)
    {
        if(no==null)
            return false;
        if(no.esq==null|| no.dir == null)
            return false;

        if(no.chave==min)
        {
            delete(no, no.esq.chave);
            // if(no.dir != null)
            //                no.dir=null;
            if(no.esq != null)
                no.esq=null;
        }
        removeForaIntervalo(no.esq, min, max);

        if (no.chave == max)
        {
           delete(no, no.dir.chave);
            if(no.dir != null)
                no.dir=null;
        }
        removeForaIntervalo(no.dir, min, max);

        return true;
    }
    public boolean eBalanceada()
    {
        if(min_dist==max_dist || min_dist-max_dist==1|| min_dist-max_dist==-1)
            return true;
        else
            return false;
    }
    public No obtemAncestralComum(Chave chave, Chave chave2)
    {
        return obtemAncestralComum(getNo(chave), getNo(chave2));
    }
    public No obtemAncestralComum(No primeiroNo, No segundoNo)
    {
        comum="";
//        this.get(primeiroNo.chave);
//        System.out.printf("comum"+ comum);
//        this.get(segundoNo.chave);
//        System.out.printf("comum"+ comum);

        int cmp = primeiroNo.chave.compareTo(segundoNo.chave);
        if(cmp > 0) //d
        {
            this.get(primeiroNo.chave);
            this.get(segundoNo.chave);
        }
        else if(cmp < 0) //e
        {
            this.get(segundoNo.chave);
            this.get(primeiroNo.chave);
        }



        int aux= comum.lastIndexOf(" ")-1;
        comum = comum.substring(aux, comum_quant*2);
        comum = comum.replaceAll(" ", "");
        System.out.println("Chave: "+ comum);
        return MainEx5.getNo(this, Integer.parseInt(comum));
    }

}