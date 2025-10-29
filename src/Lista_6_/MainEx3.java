package Lista_6_;

import Lista_6_.estrutura.ArvoreBinariaBusca;

public class MainEx3
{
    public static void main(String args[])
    {
        //atribuições possuem complexidade O(1)
        ArvoreBinariaBusca<Integer, String> arvoreBinaria = new ArvoreBinariaBusca<>();
        ArvoreBinariaBusca<Integer, String> arvoreBinaria2 = new ArvoreBinariaBusca<>();



        arvoreBinaria.put(1, "Teste1");// 1,10,3,8,5
        arvoreBinaria.put(10, "Teste2");
        arvoreBinaria.put(3, "Teste3");
        arvoreBinaria.put(8, "Teste4");
        arvoreBinaria.put(5, "Teste5");

        //para dar true, mesma estrutura
//        arvoreBinaria2.put(1, "Teste1");//1,9,4,7,6
//        arvoreBinaria2.put(9, "Teste2");
//        arvoreBinaria2.put(4, "Teste3");
//        arvoreBinaria2.put(7, "Teste4");
//        arvoreBinaria2.put(6, "Teste5");

        //para dar false, estrutura diferente
        arvoreBinaria2.put(5, "test1");
        arvoreBinaria2.put(4, "test2");
        arvoreBinaria2.put(3, "test3");
        arvoreBinaria2.put(2, "test4");
        arvoreBinaria2.put(1, "test5");

        //Inserção numa arvore binaria de busca possui Complexidade O(log n)

        //Complexidade O(N), onde N= numero de itens da arvore, pois percorre toda a arvore
        // conferindo cada no e suas folhas
        System.out.printf("São similares? " + arvoreBinaria.eSimilar(arvoreBinaria2));
    }
}
