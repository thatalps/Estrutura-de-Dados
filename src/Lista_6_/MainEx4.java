package Lista_6_;

import Lista_6_.estrutura.ArvoreBinariaBusca;

public class MainEx4
{
    public static void main(String args[])
    {

        ArvoreBinariaBusca<Integer, String> arvoreBinaria = new ArvoreBinariaBusca<>();
        //atribuição possui complexidade O(1)
        arvoreBinaria.put(5, "Teste1");
        arvoreBinaria.put(4, "Teste2");
        arvoreBinaria.put(3, "Teste3");
        arvoreBinaria.put(8, "Teste4");
        arvoreBinaria.put(6, "Teste5");
        //Inserção numa arvore binaria de busca possui Complexidade O(log n)

        //caso false
//        System.out.printf("removeu? "+arvoreBinaria.removeForaIntervalo(3,8));
        //caso true
        System.out.println("removeu? "+arvoreBinaria.removeForaIntervalo(5,8));
        //Complexidade O(H), onde N= numero de itens da arvore, pois no pior caso
        // percorre toda a arvore conferindo cada no e suas folhas para achar o intervalo

        arvoreBinaria.mostra();
        //Complexidade O(N), onde N= numero de nos da arvore
    }
}
