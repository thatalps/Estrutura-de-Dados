package Lista_7_;

import Lista_7_.estrutura.ArvBinBusca;
import Lista_7_.estrutura.RedBlackBST;

public class MainEx1
{
    public static void main(String[] args)
    {
        //Pasta imagensExericio1 possui um desenho no paint de cada uma dessas arvores.
        // Nas letras A e C, há uma boa diferença estrutural:
        // As arvores binarias de busca
        // tendem a ser degeneradas quando há a inserção de numeros sequenciais,
        // enquanto nas arvores rubro negras há o balanceamento da arvore em cada inserção.
        // Enquanto, na letra B, ambas arvores sao iguais.

        ////////////////////////////////////////////////////////letra A

        RedBlackBST arvoreRubroNegra = new RedBlackBST();

        arvoreRubroNegra.put(70, "item 1");
        arvoreRubroNegra.put(19, "item 2");
        arvoreRubroNegra.put(11, "item 3");
        arvoreRubroNegra.put(89, "item 4");
        arvoreRubroNegra.put(13, "item 5");
        arvoreRubroNegra.put(17, "item 6");

        System.out.println("\n-------------Letra A\n--- Arvore rubro negra");
        arvoreRubroNegra.mostra();

        ArvBinBusca arvBinBusca = new ArvBinBusca<>();
        arvBinBusca.put(70,"item1");
        arvBinBusca.put(19,"item2");
        arvBinBusca.put(11,"item3");
        arvBinBusca.put(89,"item4");
        arvBinBusca.put(13,"item5");
        arvBinBusca.put(17,"item6");
        System.out.println("\n--- Arvore binaria de busca");
        arvBinBusca.mostra();

        ////////////////////////////////////////////////////////letra B
        RedBlackBST arvoreRubroNegra2 = new RedBlackBST();

        arvoreRubroNegra2.put(23, "item 1");
        arvoreRubroNegra2.put(15, "item 2");
        arvoreRubroNegra2.put(41, "item 3");
        arvoreRubroNegra2.put(11, "item 4");
        arvoreRubroNegra2.put(13, "item 5");
        arvoreRubroNegra2.put(14, "item 6");
        arvoreRubroNegra2.put(50, "item 7");
        arvoreRubroNegra2.put(38, "item 8");

        System.out.println("\n\n-------------LetraB\n--- Arvore rubro negra");
        arvoreRubroNegra2.mostra();

        ArvBinBusca arvBinBusca2 = new ArvBinBusca<>();
        arvBinBusca2.put(23,"item1");
        arvBinBusca2.put(15,"item2");
        arvBinBusca2.put(41,"item3");
        arvBinBusca2.put(11,"item4");
        arvBinBusca2.put(13,"item5");
        arvBinBusca2.put(14,"item6");
        arvBinBusca2.put(50,"item7");
        arvBinBusca2.put(38,"item8");
        System.out.println("\n--- Arvore binaria de busca");
        arvBinBusca2.mostra();

        ////////////////////////////////////////////////////////letra C

        RedBlackBST arvoreRubroNegra3 = new RedBlackBST();

        arvoreRubroNegra3.put(1, "item 1");
        arvoreRubroNegra3.put(2, "item 2");
        arvoreRubroNegra3.put(3, "item 3");
        arvoreRubroNegra3.put(4, "item 4");
        arvoreRubroNegra3.put(5, "item 5");
        arvoreRubroNegra3.put(6, "item 6");
        arvoreRubroNegra3.put(7, "item 7");

        System.out.println("\n\n-------------Letra C\n--- Arvore rubro negra");
        arvoreRubroNegra3.mostra();

        ArvBinBusca arvBinBusca3 = new ArvBinBusca<>();
        arvBinBusca3.put(1,"item1");
        arvBinBusca3.put(2,"item2");
        arvBinBusca3.put(3,"item3");
        arvBinBusca3.put(4,"item4");
        arvBinBusca3.put(5,"item5");
        arvBinBusca3.put(6,"item6");
        arvBinBusca3.put(7,"item7");
        System.out.println("\n--- Arvore binaria de busca");
        arvBinBusca3.mostra();
    }
}