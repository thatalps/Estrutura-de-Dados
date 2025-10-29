package Lista_4_;

import Lista_4_.estrutura.Lista;

public class MainEx1 {
    public static void main(String[] args)
    {
        Lista lista = new Lista();

        for (int i = 0; i < 10000; i++)
        {
            lista.insere(i);
        }

        long start1 = System.currentTimeMillis();
        System.out.println(lista.tamanhoRecursivo());
        long elapsed1 = System.currentTimeMillis() - start1;

        System.out.println("Recursivo-tempo: "+elapsed1 );

        long start2 = System.currentTimeMillis();
        System.out.println(lista.tamanho());
        long elapsed2 = System.currentTimeMillis() - start2;

        System.out.println("Não recursivo-tempo: "+ elapsed2);
        //Nem todos os casos de recursividade são mais rápidos dependendo da linguagem e da máquina utilizada.
        //Ambos métodos possuem complexidade O(n), que é o tamanho da entrada.
        //Entretanto, existe a possibilidade de utilizarmos uma outra forma de contar os itens de uma lista
        //Adicionando a uma variavel +1 a cada vez que é inserido um item na lista
        // e por conseguinte removendo -1 quando removido.
        //Nesse contexto, seria complexidade O(1), pois seria apenas retornar o valor de uma variavel.
    }
}