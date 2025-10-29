package Lista_8_;

import Lista_8_.estrutura.HeapBinariaMaxima;
import Lista_8_.estrutura.HeapBinariaMinima;

public class MainEx3
{
    //Implemente agora um construtor que faça uma operação análoga para a classe
    //HeapBinariaMaxima.
    public static void main(String args[])
    {
        int tamanho = 6;
        int vetor[] = {1, 5, 6, 3, 7, 2};

        HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);
        heapMaxima.imprime();

		HeapBinariaMinima heapMin = new HeapBinariaMinima(tamanho, vetor);
        heapMin.imprime();

        HeapBinariaMaxima heapMaximafinal = new HeapBinariaMaxima(heapMin);
        heapMaximafinal.imprime();
    }
}
