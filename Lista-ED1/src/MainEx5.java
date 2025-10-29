import java.util.Scanner;

public class MainEx5
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        boolean balanceado=true;
        String entrada="";
        Pilha pilha_aberto = new Pilha(100);

        System.out.println("Entrada: ");
        entrada = teclado.nextLine();

        for (int i =0; i< entrada.length();i++)
        {
            if(entrada.charAt(i)=='{'||entrada.charAt(i)=='['||entrada.charAt(i)=='(')
                pilha_aberto.adicionaNaPilha(entrada.charAt(i)); //[a]{as}()

            else if ( (entrada.charAt(i)=='}'||entrada.charAt(i)==']'||entrada.charAt(i)==')') && pilha_aberto.estaVazia() )
            {
                balanceado = false;
            }
            else if (entrada.charAt(i)=='}'||entrada.charAt(i)==']'||entrada.charAt(i)==')')
                switch (entrada.charAt(i))
                {
                    case '}':
                        if (pilha_aberto.pegaTopo()=='{')// confere o primeiro dos abertos
                            pilha_aberto.retornaPrimeiroItemEapaga();//pop
                        else
                            balanceado =false;
                        break;
                    case ']':
                        if (pilha_aberto.pegaTopo()=='[')// confere o primeiro dos abertos
                            pilha_aberto.retornaPrimeiroItemEapaga();//pop
                        else
                            balanceado =false;
                        break;

                    case ')':
                        if (pilha_aberto.pegaTopo()=='(') // confere o primeiro dos abertos
                            pilha_aberto.retornaPrimeiroItemEapaga();//pop
                        else
                            balanceado =false;
                        break;
                }
        }
        if(balanceado)
            System.out.println("Está balanceado!");
        else
            System.out.println("Não está balanceado!");
        teclado.close();
    }
}