package Lista_5_;

import Lista_5_.estrutura.ListaDuplamente;

public class MainEx5
{
    public static void main(String[] args)
    {
        ListaDuplamente l1 =new ListaDuplamente();
        l1.insere(1);
        l1.insere(2);
        l1.insere(3);
        l1.insere(4);
        l1.insere(5);

        ListaDuplamente l2 =new ListaDuplamente();
        l2.insere(1);
        l2.insere(2);
        l2.insere(3);
        l2.insere(4);
        l2.insere(5);
        //Todas as atribuições acima possuem Complexidade O(1)


        System.out.println(l1.verificaIgualdade(l2));
        // A complexidade é O(n), onde N= tamanho da maior lista, pois percorre as duas ao mesmo tempo até encontrar
        // um item diferente


    }
}
