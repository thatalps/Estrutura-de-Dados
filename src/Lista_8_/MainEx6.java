package Lista_8_;

import Lista_8_.estrutura.HeapBinariaMaxima;

public class MainEx6
{
    public static void main(String args[])
    {
        // itens do vetor
      //  22 4 35 12 3 18 12 55

        //primeiro passo é construir a heapMin, que constitui em organizar de modo a respeitar
        // a estrutura menor em cima(no pai) e maiores embaixo(filhos)
        //depois disso
        // vai trocando, a raiz com a folha n vezes
        // refaz o heap para a estrutura estar válida

        HeapBinariaMaxima maxima = new HeapBinariaMaxima(7, new int []{ 22,4, 35, 12, 3, 18, 12, 55});
//        HeapBinariaMaxima maxima = new HeapBinariaMaxima(5, new int []{ 1,2,3,4,5});
        System.out.println("---------Valor na main");
        maxima.imprime();
        System.out.println("\n---------Valores no Heap");
        maxima.heapsort();

        System.out.println("\n---------Valor final ordenado: ");
        maxima.imprimeTamanho();
    }
}
