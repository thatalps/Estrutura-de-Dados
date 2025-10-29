package Lista_1_;

import Lista_1_.estrutura.PilhaGenerica;

import java.util.Scanner;
import java.io.IOException;

public class MainEx4
{
    public static void main(String args[]) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        int cont = 0;

        do
        {
            System.out.println("Entrada:");
            entrada = scanner.nextLine();
        }while(!ehValido(entrada));

        if(ehInteiro(entrada))
        {
            PilhaGenerica<Integer> pilhaPrincipal = new PilhaGenerica<>(entrada.length());

            for(int i = 0;i < entrada.length() ;i++)
                pilhaPrincipal.push(Character.getNumericValue(entrada.charAt(i)));

            System.out.println("Retire:");
            int retirar = Character.getNumericValue((char)System.in.read());

            PilhaGenerica<Integer> pilhaAux = new PilhaGenerica<>(entrada.length());

            for(int j = 0; j < entrada.length() ;j++)
            {
                if(pilhaPrincipal.retornaUltimoElemento()!= null && !(pilhaPrincipal.retornaUltimoElemento() == retirar))
                    pilhaAux.push(pilhaPrincipal.pop());
                else{
                    cont++;
                    pilhaPrincipal.pop();
                }
            }

            pilhaPrincipal.clearPilha();
            for(int j = 0; j < entrada.length() - cont ;j++){
                pilhaPrincipal.push(pilhaAux.pop());
            }

            System.out.println("");
            for(int k = 0; k < entrada.length() - cont ;k++){
                if(pilhaPrincipal.retornaUltimoElemento() != null){
                    System.out.print(pilhaPrincipal.pop());
                }
            }
        }
        else{
            PilhaGenerica<Character> pilhaPrincipal = new PilhaGenerica<>(entrada.length());

            for(int i = 0;i < entrada.length() ;i++){
                pilhaPrincipal.push(entrada.charAt(i));
            }

            System.out.println("Retire:");
            char retirar = (char)System.in.read();

            PilhaGenerica<Character> pilhaAux = new PilhaGenerica<>(entrada.length());

            for(int j = 0; j < entrada.length() ;j++)
            {
                if(pilhaPrincipal.retornaUltimoElemento()!= null && !(pilhaPrincipal.retornaUltimoElemento() == retirar))
                    pilhaAux.push(pilhaPrincipal.pop());
                else
                {
                    cont++;
                    pilhaPrincipal.pop();
                }
            }
            pilhaPrincipal.clearPilha();

            for(int j = 0; j < entrada.length() - cont ;j++)
                pilhaPrincipal.push(pilhaAux.pop());

            for(int k = 0; k < entrada.length() - cont ; k++)
                if(pilhaPrincipal.retornaUltimoElemento() != null)
                    System.out.print(pilhaPrincipal.pop());
        }
    }
    public static boolean ehValido(String str)
    {
        if(str.matches("[0-9]+"))
            return true;
        if(str.matches("^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"))
            return true;
        //caso não
        return false;
    }
    public static boolean ehInteiro(String str)
    {
        if(str.matches("[0-9]+"))
            return true;
        else
            return false;
    }
}