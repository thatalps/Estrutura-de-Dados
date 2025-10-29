import java.util.Scanner;

public class MainEx2 {
    public static void main(String args[])
    {
        //DEVE INICIAR COM ALGUMA LETRA != DE D
        Scanner teclado = new Scanner(System.in);

        Pilha pilha = new Pilha(20);

        String entrada;
        char aux;
        int cont=0, max=0;

        System.out.println("Entrada: ");
        entrada = teclado.nextLine();

        for (int i =0; i< entrada.length();i++)
            pilha.adicionaNaPilha(entrada.charAt(i));//aDa


        //joga fora o primeiro item da pilha
        pilha.retornaPrimeiroItemEapaga();

        for (int i =1; i< entrada.length();i=i+2)
        {
            aux = pilha.retornaPrimeiroItemEapaga();
            if(aux!='D')
            {
                System.out.println("Está incorreto!");
                cont++;
                break;
            }
            aux = pilha.retornaPrimeiroItemEapaga();

        }
        if(cont==0)
            System.out.println("Está correto!");

        teclado.close();
    }
}
