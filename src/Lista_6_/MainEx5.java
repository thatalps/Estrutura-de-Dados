package Lista_6_;

import Lista_6_.estrutura.ArvoreBinariaBusca;

public class MainEx5
{
    public static void main(String []args)
    {
        ArvoreBinariaBusca<Integer, String> arvoreBinaria2 = new ArvoreBinariaBusca<>();//Complexidade O(1)
//        arvoreBinaria2.put(5, "test1");
//        arvoreBinaria2.put(4, "test2");
//        arvoreBinaria2.put(3, "test3");
//        arvoreBinaria2.put(2, "test4");
//        arvoreBinaria2.put(1, "test5");
//        System.out.printf("No - " + arvoreBinaria2.obtemAncestralComum( 1,2));
        arvoreBinaria2.put(1, "Teste1");
        arvoreBinaria2.put(9, "Teste2");
        arvoreBinaria2.put(4, "Teste3");
        arvoreBinaria2.put(7, "Teste4");
        arvoreBinaria2.put(6, "Teste5");
        //Inserção numa arvore binaria de busca possui Complexidade O(log n)

        System.out.printf("No - " + arvoreBinaria2.obtemAncestralComum( 4,6));
        //Comlexidade O(H), onde H=altura
    }


    public static ArvoreBinariaBusca.No getNo(ArvoreBinariaBusca arvoreBinariaBusca, int chave)
    {
        return arvoreBinariaBusca.getNo(chave);//Complexidade O(H), onde H=altura da arvore
    }
}
