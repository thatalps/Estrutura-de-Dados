package Lista_5_;

import Lista_5_.estrutura.ListaDuplamente;

public class MainEx6
{
    public static void main(String []args)
    {
        ListaDuplamente lista = new ListaDuplamente();//O(1)

        //numeros de tel
        lista.insereDecrescente(219);
        lista.insereDecrescente(100);
        lista.insereDecrescente(3);
        lista.insereDecrescente(199);
        lista.insereDecrescente(57);
        lista.insereDecrescente(5700);
        lista.insereDecrescente(150);
        //A complexidade de cada uma das linhas acima é O(n) pois no pior caso vai até o fim da lista para
        // inserir o novo item


        lista.imprime();//O(N), percorre todos os itens da Lista
    }
}
