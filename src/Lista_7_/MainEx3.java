package Lista_7_;

import Lista_7_.estrutura.RedBlackBST;

public class MainEx3
{
    public static void main(String[] args)
    {
        RedBlackBST arvoreRubroNegra = new RedBlackBST();
        arvoreRubroNegra.put(70, "item 1");
        arvoreRubroNegra.put(19, "item 2");
        arvoreRubroNegra.put(11, "item 3");
        arvoreRubroNegra.put(89, "item 4");
        arvoreRubroNegra.put(13, "item 5");
        arvoreRubroNegra.put(17, "item 6");

        System.out.println("Numero de nós pretos: "+arvoreRubroNegra.alturaNegra());

    }
}
