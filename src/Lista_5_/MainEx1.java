package Lista_5_;

import Lista_5_.estrutura.ListaEncadeada;

public class MainEx1
{
    public static void main(String[] args)
    {
        ListaEncadeada l1 = new ListaEncadeada(); //O(1)
        ListaEncadeada l2 = new ListaEncadeada();
        ListaEncadeada l3;

        l1.insere(1);
        l1.insere(2);
        l1.insere(3);
        l1.insere(4);
        l1.insere(5);
        l1.insere(6);
        l1.insere(7);
        l1.insere(700);

        l2.insere(1);
        l2.insere(3);
        l2.insere(6);
        l2.insere(8);
        l2.insere(700);
        //Todas as atribuições acima possuem Complexidade O(1)

        l3= ListaEncadeada.intersecaoListas(l1,l2);
        // O metodo de interseção possui Complexidade O(N*M), pois percorre a lista1 e a cada looping percorre a
        // lista2 procurando o que possuem em comum,
        // onde N = quantidade de itens da lista1 e M = quantidade de itens da lista2

        l3.imprime();//O(N), percorre todos os itens da Lista
    }
}