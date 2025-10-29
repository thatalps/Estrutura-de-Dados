package Lista_1_;

import Lista_1_.estrutura.PilhaDupla;

public class MainEx3
{
    public static void main(String args[])
    {
        PilhaDupla pilha_dois_lados = new PilhaDupla(10);

        //pilha1 esquerda
        pilha_dois_lados.inserePilha1('b');
        pilha_dois_lados.inserePilha1('b');
        pilha_dois_lados.inserePilha1('b');
        pilha_dois_lados.inserePilha1('b');
        pilha_dois_lados.inserePilha1('b');

        //pilha2 direita
        pilha_dois_lados.inserePilha2('a');
        pilha_dois_lados.inserePilha2('a');
        pilha_dois_lados.inserePilha2('a');
        pilha_dois_lados.inserePilha2('a');
        pilha_dois_lados.inserePilha2('a');

        //possibilida vetor de ser sobrescrito
        pilha_dois_lados.retiraPilha2();
        pilha_dois_lados.retiraPilha2();
        pilha_dois_lados.retiraPilha2();
        pilha_dois_lados.retiraPilha2();
        pilha_dois_lados.retiraPilha2();
        pilha_dois_lados.retiraPilha1();
        pilha_dois_lados.retiraPilha1();
        pilha_dois_lados.retiraPilha1();
        pilha_dois_lados.retiraPilha1();
        pilha_dois_lados.retiraPilha1();

//        coloca nas pontas
        pilha_dois_lados.inserePilha1('c');
        pilha_dois_lados.inserePilha2('c');


        pilha_dois_lados.printaVetor();
    }

}