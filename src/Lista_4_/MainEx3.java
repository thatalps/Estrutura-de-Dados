package Lista_4_;

import Lista_4_.estrutura.ListaOrdenadaGenerica;

public class MainEx3
{
    public static void main(String []args)
    {
        ListaOrdenadaGenerica lista = new ListaOrdenadaGenerica<>();
        lista.insereOrdenada("joao");
        lista.insereOrdenada("ana");
        lista.insereOrdenada("pedro");
        lista.insereOrdenada("carlos");
        lista.insereOrdenada("Alice");
        // nesse método insereOrdenada vasculho todos os itens da lista e já insiro os nomes em ordem
        //Gerando complexidade O(n) que seria referente ao pior caso, no caso de inserir no fim da lista.

        lista.imprime();
    }
}

