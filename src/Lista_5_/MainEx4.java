package Lista_5_;

import Lista_5_.estrutura.ListaDuplamente;

public class MainEx4
{
    public static void main(String[] args)
    {
        ListaDuplamente l1 =new ListaDuplamente();
        l1.insere(1);
        l1.insere(2);
        l1.insere(3);
        l1.insere(4);
        l1.insere(5);
        //Todas as atribuições acima possuem Complexidade O(1)


        l1.imprime();//O(N), onde N= tamanho da lista

        l1.trocaElos(4,0);//O(N), onde os loopins são utilizados para encontrar os elos com determidado indice, onde N= tamanho da lista

        l1.imprime();//O(N), onde N= tamanho da lista
    }
}
