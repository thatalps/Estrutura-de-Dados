package Lista_2_;

import Lista_2_.estrutura.Fila;

import java.util.Scanner;

public class MainEx2
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);

        Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        Fila f3 = new Fila(f1.getTamanho()+f2.getTamanho());

        f1.insere(1);
        f1.insere(3);
        f1.insere(5);

        f2.insere(2);
        f2.insere(4);
        f2.insere(6);
        f3.combinaFilas(f1,f2);

    }
}
