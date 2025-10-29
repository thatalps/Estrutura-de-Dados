package Lista_2_;

import Lista_2_.estrutura.Fila;

import java.util.Scanner;
public class MainEx5 {
    public static void main(String[] args)
    {
        Scanner teclado =  new Scanner(System.in);
        int n =0, cont=0, agora=0, aux=0;
        String resp="", temp="";

        System.out.println("Insira N:");
        n = teclado.nextInt();

        Fila fila;
        fila = new Fila(100*n);

        //transforma em binário
        for (int j=1;j<=n;j++)// 1 2 3
        {
            for (int i = j; i > 0; i = (int) i / 2 ) //3%2 ==1, 4%2==0 1010
            {
                agora = (int) i % 2;
                cont++;
                fila.insere(agora);
                if(i==1)
                {
                    cont++;
                    fila.insere(9);
                }
            }
        }

        int  aux2=0;
        do
        {
            aux2= fila.remove();
            if(aux2==9)
                {
                    for(int i =temp.length()-1;i>=0;i--)
                    {
                     resp+=temp.charAt(i);
                    }
                    resp+=' ';
                    temp="";
                }
            else
                temp+=aux2;
        } while (!fila.vazia());

        //printa na tela
        System.out.println(resp);
    }
}