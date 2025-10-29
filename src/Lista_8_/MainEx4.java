package Lista_8_;

import Lista_8_.estrutura.HeapBinariaMaxima;

public class MainEx4
{
    // Implemente um método não recursivo que verifica se uma árvore armazenada em um vetor
    //de inteiros corresponde a uma Heap Máxima, isto é,
    // se ttodo nó possui uma chave maior ou igual às chaves dos seus filhos.
    // O método deve possuir o seguinte protótipo:
    public static void main(String []args)
    {
        HeapBinariaMaxima maxima = new HeapBinariaMaxima(5, new int []{5,4,3,2,1});
        HeapBinariaMaxima maxima2 = new HeapBinariaMaxima(6, new int []{5,4,3,2,1,7});
        maxima.imprime();
        System.out.println("A propriedade HeapMAX1 está sendo aplicada? "+ maxima.verificaPropriedadeHeap(new int []{5,4,3,2,1}));
        maxima2.imprime();
        System.out.println("A propriedade HeapMAX2 está sendo aplicada? "+ maxima2.verificaPropriedadeHeap(new int []{5,4,3,2,1,7}));
    }
}
