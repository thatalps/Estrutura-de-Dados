package Lista_4_;

import Lista_4_.estrutura.ListaOrdenadaGenerica;

public class MainEx4
{
    public static void main(String[] args)
    {
        ListaOrdenadaGenerica l = new ListaOrdenadaGenerica();//O(1)
        String frase = "o sol está forte hoje ";
        String aux="";

        for(int i=0; i <frase.length();i++) //O(n), pois percorre todos os caracteres da frase
        {
            if(frase.charAt(i) == ' ')
            {
                l.insere( aux.trim() );
                aux="";
            }
            aux+=frase.charAt(i);
        }

        l.imprime();
        //nesse método a complexidade é O(n), onde n= tamanho da lista

        System.out.println();

        l.imprimeAoContrario();
        //nesse metodo a complexidade é O(n), onde n= tamanho da lista
    }
}
