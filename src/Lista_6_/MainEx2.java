package Lista_6_;

import Lista_6_.estrutura.ArvoreBinariaBusca;

public class MainEx2
{
    public static void main(String args[])
    {
        ArvoreBinariaBusca<Integer, String> arvoreBinaria = new ArvoreBinariaBusca<>();
        int[] vetor = { 1,9,4,7,6};
        //atribuições possuem complexidade O(1)
        arvoreBinaria.constroiArvore(vetor); //Complexidade O(N), onde N= numero de itens do vetor
        arvoreBinaria.mostra();//Complexidade O(N), onde N= numero de nos da arvore
    }

    public static void preenche(ArvoreBinariaBusca arvoreBinariaBusca, int chave, String valor)
    {
        arvoreBinariaBusca.put(chave,valor);//Complexidade O(log n)
    }
}
