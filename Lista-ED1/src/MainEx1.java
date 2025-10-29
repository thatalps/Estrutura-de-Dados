import java.util.Scanner;

public class MainEx1
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);

        Pilha pilha = new Pilha(20);

        String entrada1, entrada2;
        do {
            System.out.println("Entrada: ");
            entrada1 = teclado.nextLine();

            System.out.println("Entrada invertida: ");
            entrada2 = teclado.nextLine();
        } while(entrada1.length()!=entrada2.length());

        for (int i=0; i<entrada1.length() ;i++) //coloquei na pilha
            pilha.adicionaNaPilha(entrada1.charAt(i));


        int cont=0;

        for (int i=0; i<entrada1.length() ;i++) //confiro na hora
        {
            if(pilha.retornaPrimeiroItemEapaga() == entrada2.charAt(i))
                cont++;
        }

        if(cont==entrada2.length()) //se todos os itens são iguais
            System.out.println("São inversas!");
        else
            System.out.println("Não são inversas!");

        teclado.close();
    }
}