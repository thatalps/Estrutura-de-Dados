package Lista_4_;

import Lista_4_.estrutura.ListaOrdenada;

public class MainEx2
{
    public static void main(String[] args)
    {
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        ListaOrdenada listaOrdenada2 = new ListaOrdenada();

        listaOrdenada.insere(5);
        listaOrdenada.insere(1);
        listaOrdenada.insere(3);
        listaOrdenada.insere(12);
        listaOrdenada2.insere(6);
        listaOrdenada2.insere(2);
        listaOrdenada2.insere(4);
        listaOrdenada2.insere(8);
        listaOrdenada2.insere(22);
        listaOrdenada2.insere(120);
        listaOrdenada2.insere(150);

        listaOrdenada.imprime();
        listaOrdenada2.imprime();
        //Digamos que a lista 1 tem N itens e a lista 2 possui M itens
        //Complexidade O(N+M)
        //Percorri as duas listas cada uma em um while e aproveitei o metodo insere da lista ordenada que já insere na
        // ordem cada um dos itens de cada lista.
        ListaOrdenada listaOrdenada3 = ListaOrdenada.concatenaOrdenada(listaOrdenada, listaOrdenada2);
        listaOrdenada3.imprime();

    }
}
