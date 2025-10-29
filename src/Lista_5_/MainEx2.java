package Lista_5_;

import Lista_5_.estrutura.ListaCircular;

public class MainEx2
{
    public static void main(String[] args)
    {
        ListaCircular l1 = new ListaCircular();
        ListaCircular l2 = new ListaCircular();
        ListaCircular l3;
        //Todas as atribuições acima possuem Complexidade O(1)

        l1.insere(1);//O(1)
        l1.insere(3);//O(1)
        l1.insere(5);//O(1)
        l1.insere(7);//O(1)
        l1.imprime();//O(N)

        l2.insere(2);//O(1)
        l2.insere(4);//O(1)
        l2.insere(6);//O(1)
        l2.imprime();//O(N)

        l3 = l1.merge(l2);//metodo possui complexidade O(N+M),
        // onde N= quantidade de itens da lista1, M= quantidade de itens da lista2

        l3.imprime();//O(N)
    }
}
