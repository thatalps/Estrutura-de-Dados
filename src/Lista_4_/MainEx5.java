package Lista_4_;

import Lista_4_.estrutura.ListaOrdenadaGenerica;

public class MainEx5
{
    public static void main(String [] args)
    {
        ListaOrdenadaGenerica l = new ListaOrdenadaGenerica();//O(1)
        String frase = "o sol está forte hoje";
        String aux="";

        for(int i=0; i <frase.length();i++) //O(n), pois percorre toda a frase, n= quantidade de palavras na frase
        {
            if(frase.charAt(i) == ' ')
            {
                l.insere(aux.trim());
                aux="";
            }
            aux+=frase.charAt(i);
        }

        l.inverteLetrasPalavras();
        //nesse método a complexidade é O(n*n), onde n*n= numero de palavras * numero de letras de cada palavra
        System.out.println();

        l.imprime();
        //nesse método a complexidade é O(n), onde n= tamanho da lista
        System.out.println();

        l.imprimeAoContrario();
        //nesse metodo a complexidade é O(n), onde n= tamanho da lista
    }
}
