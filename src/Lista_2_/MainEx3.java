package Lista_2_;

import Lista_2_.estrutura.Fila;
import Lista_2_.estrutura.FilaGenerica;
import Lista_2_.estrutura.PilhaGenerica;

public class MainEx3
{
    public static void main(String []args)
    {
        PilhaGenerica p1 = new PilhaGenerica<>(10);
        PilhaGenerica p2 = new PilhaGenerica<>(10);
        PilhaGenerica p3 = new PilhaGenerica<>(10);

        FilaGenerica fg = new FilaGenerica<>(10);

        Fila f1 = new Fila(10);
        Fila f2 = new Fila(10);
        Fila f3 = new Fila(10);

//        Como você implementaria uma fila (generica) de pilhas (genericas)?
        if(!fg.isCheia())
            fg.insere(p1);
        if(!fg.isCheia())
            fg.insere(p2);
        if(!fg.isCheia())
            fg.insere(p3);

//        E uma pilha (generica) de filas?
        if(!p1.isCheia())
            p1.push(f1);
        if(!p1.isCheia())
            p1.push(f2);
        if(!p1.isCheia())
            p1.push(f3);

//        E uma fila de filas?
        if(!fg.isCheia())
            fg.insere(f1);
        if(!fg.isCheia())
            fg.insere(f2);
        if(!fg.isCheia())
            fg.insere(f3);
    }
}
