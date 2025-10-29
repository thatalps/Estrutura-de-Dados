package Lista_8_;

import Lista_8_.estrutura.HeapBinariaMaxima;
import Lista_8_.estrutura.HeapBinariaMinima;

public class MainEx2
{
    //2) Para a classe HeapBinariaMinima, crie um construtor que receba uma Heap Máxima
    //como parâmetro e a converta em Heap Mínima.
    public static void main(String args[])
    {
        int tamanho = 6;
        int vetor[] = {1, 5, 6, 3, 7, 2};

        HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);
        heapMaxima.imprime();

        HeapBinariaMinima heapMin = new HeapBinariaMinima(tamanho, vetor);
        heapMin.imprime();

        HeapBinariaMinima heapMinimafinal = new HeapBinariaMinima(heapMaxima);
        heapMinimafinal.imprime();
    }
}
