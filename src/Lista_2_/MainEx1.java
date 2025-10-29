package Lista_2_;

import Lista_2_.estrutura.Fila;

import java.util.Scanner;

public class MainEx1
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        int opc=0,p=0;
        Fila fila = new Fila(100);

        do
        {
            System.out.print("\n\nINTERFACE SISTEMA OPERACIONAL\n1-incluir novo processo\n2-retirar processo da " +
                    "fila\n3-imprimir\n4-sair\n>");
            opc=teclado.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Qual processo deseja inserir?");
                    p = teclado.nextInt();
                    if(!fila.cheia())
                    {
                        fila.insere(p);
                        System.out.println("Inserido com sucesso!");
                    }
                    else
                        System.out.println("Fila cheia!");
                    break;
                case 2:
                    if(!fila.vazia())
                        System.out.println("Removido o processo-> "+ fila.remove());
                    else
                        System.out.println("Fila vazia!");
                    break;
                case 3:
                    if(fila.vazia())
                        System.out.println("Fila vazia!");
                    else
                      fila.imprime();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Insira valor válido!\n");
            }
        }while(opc!=4);
    }

}
