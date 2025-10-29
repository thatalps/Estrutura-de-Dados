package Lista_1_;

import Lista_1_.estrutura.Pilha;

import java.util.Scanner;

public class MainEx8
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);

        Pilha pilha = new Pilha(100);
        Pilha pilha_aux = new Pilha(100);
        int entrada=0;
        char aux='1';
        String texto="";
        String pares="";
        char temp =' ';

        System.out.println("Valor de N: ");
        entrada = teclado.nextInt();

        for (int i =entrada; i>0; i--) //preenche pilha até o numero N, primeiro numero q sai é 1
            pilha_aux.adicionaNaPilha(Integer.toString(i).charAt(0));

        for (int i = 1; i<entrada ; i++)//1 2 3 4 5
        {
            for(int j=-1+i; j<entrada; j++)// 0, 1, 2, 3, 4
            {
                aux = pilha_aux.retornaPrimeiroItemEapaga(); //tira primeiro item da pilha auxiliar
                if(j==i) //pega par ordenado nessa string
                {
                    pilha.adicionaNaPilha(temp);
                    pilha.adicionaNaPilha(aux);
                    // pares += "{ " + aux + ", " + temp + "} ";
                }
                texto += " "+ aux; //concatena os proximos numeros
                System.out.println(texto);
                temp = aux;// 1
            }
            texto="";
            for (int k =entrada; k>i; k--) //preenche pilha até o numero n-1
                pilha_aux.adicionaNaPilha(Integer.toString(k).charAt(0));
        }
        System.out.println(" " + pilha_aux.retornaPrimeiroItemEapaga());
        for(int x=0; !pilha.estaVazia();x++)
            System.out.printf("{ " + pilha.retornaPrimeiroItemEapaga() + ", " + pilha.retornaPrimeiroItemEapaga() +
                    "} ");
        teclado.close();
    }
}
