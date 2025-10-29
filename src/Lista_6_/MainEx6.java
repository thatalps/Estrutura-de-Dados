package Lista_6_;

import Lista_6_.estrutura.ArvoreBinariaBusca;

public class MainEx6
{

    public static void main(String []args)
    {
        //atribuiçõe possuem complexidade O(1)
        ArvoreBinariaBusca<Integer, String> arvoreBinaria = new ArvoreBinariaBusca<>();
        arvoreBinaria.put(10, "Teste1");// 10,8,5,3,1,12,14,15
        arvoreBinaria.put(8, "Teste2");
        arvoreBinaria.put(5, "Teste3");
        arvoreBinaria.put(3, "Teste4");
        arvoreBinaria.put(1, "Teste5");
        arvoreBinaria.put(12, "Teste5");
        arvoreBinaria.put(14, "Teste5");
        arvoreBinaria.put(15, "Teste5");
        //Inserção numa arvore binaria de busca possui Complexidade O(log n)

        ArvoreBinariaBusca<Integer, String> arvoreBinaria2 = new ArvoreBinariaBusca<>();
        //para dar false, estrutura diferente
        arvoreBinaria2.put(5, "test1");
        arvoreBinaria2.put(4, "test2");
        arvoreBinaria2.put(3, "test3");
        arvoreBinaria2.put(2, "test4");
        arvoreBinaria2.put(1, "test5");
        //Inserção numa arvore binaria de busca possui Complexidade O(log n)

        //Complexidade O(H), onde H= altura da arvore
        System.out.println("É balanceada? " + arvoreBinaria.eBalanceada());
        System.out.println("É balanceada? " + arvoreBinaria2.eBalanceada());
    }
}
