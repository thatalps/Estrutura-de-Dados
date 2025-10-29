package Lista_8_;

import Lista_8_.estrutura.HeapBinariaMaxima;

public class MainEx5
{
    // Implemente um método que remova e retorne o elemento na i-ésima posição do vetor
    // representativo de uma Heap Máxima
    public static void main(String []args)
    {
        HeapBinariaMaxima maxima = new HeapBinariaMaxima(6, new int []{ 1,2,3,4,5, 7});
        maxima.imprime();
        maxima.remove(1);
        maxima.imprime();
    }
}
