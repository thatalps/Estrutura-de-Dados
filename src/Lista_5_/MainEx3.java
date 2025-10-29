package Lista_5_;

import Lista_5_.estrutura.ListaCircular;

public class MainEx3
{
    public static void main(String[] args)
    {
        ListaCircular l1 = new ListaCircular();
        ListaCircular l2;
        l1.insere(1);
        l1.insere(2);
        l1.insere(3);
        l1.insere(4);
        l1.insere(5);
        //Todas as atribuições acima possuem Complexidade O(1)

        l1.imprime();//O(N), onde N= tamanho da lista


        l2 = l1.inverteLista(); //Complexidade O(N*N)

        l2.imprime();//O(N), onde N= tamanho da lista
    }
}
