package Lista_4_;

import Lista_4_.estrutura.Inimigo;
import Lista_4_.estrutura.ListaInimigo;

public class MainEx7
{
    public static void main(String []args)
    {
        ListaInimigo listaInimigo = new ListaInimigo();

        Inimigo i1= new Inimigo(10, 1,"Alvin");
        Inimigo i2= new Inimigo(10, 1,"Theodore");
        Inimigo i3= new Inimigo(10, 1,"Simon");


        listaInimigo.inserirInimigo(i1);
        listaInimigo.inserirInimigo(i2);
        listaInimigo.inserirInimigo(i3);
        //inserções e atribuições custam 0(1)

        Inimigo i4 = listaInimigo.localizarInimigo(i1);
        //Localizar inimigo possui complexidade O(n), onde n=quantidade de itens da lista de inimigos

        listaInimigo.inserirInimigo(i4);


        listaInimigo.efetuarDanoInimigo(i1, 1);
        listaInimigo.efetuarDanoInimigo(i2, 2);
        listaInimigo.efetuarDanoInimigo(i3, 3);
        listaInimigo.efetuarDanoInimigo(i4, 10);
        //inserções e atribuições custam 0(1)


        listaInimigo.imprimirInimigos();
        //Metodo possui complexidade O(N), onde n=quantidade de itens na lista

    }
}
