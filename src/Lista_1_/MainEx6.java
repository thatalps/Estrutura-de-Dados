package Lista_1_;

import Lista_1_.estrutura.Pilha;

import java.util.Scanner;

public class MainEx6
{
     public static void main(String args[])
        {
            Scanner teclado = new Scanner(System.in);

            Pilha pilha = new Pilha(100);
            String entrada, resposta="", frase="";
            char aux=' ';
            System.out.println("frase: ");
            entrada = teclado.nextLine();

            for (int i =0; i< entrada.length();i++)
                pilha.adicionaNaPilha(entrada.charAt(i));//adiciona na pilha//push

            for (int i =0; i< entrada.length();i++)
            {
                aux= pilha.retornaPrimeiroItemEapaga(); //pop
                frase = frase + aux;
                if(aux == ' ')
                {
                    resposta = " " + frase + resposta;
                    frase ="";
                }
            }
            resposta = frase + resposta;

            System.out.println(resposta);
            teclado.close();
        }
}
