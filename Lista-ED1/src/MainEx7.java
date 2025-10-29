import java.util.Scanner;

public class MainEx7 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        PilhaGenerica<Integer> pilhaResultados = new PilhaGenerica<>(20);
        PilhaGenerica<Integer> pilha_pos_abre_parenteses = new PilhaGenerica<>(20);
        Pilha pilhaInfixa = new Pilha(20);
        String entrada=" "; //(((2+2)+(2+3))+1) -> (9 + 1)  //  (1+((2+3)*(4*5))) -> ( 1 + ((5)*(20)) ) = 101
        //( ( ) + ( ) )
        while(!entrada.isEmpty())
        {
            System.out.println("Entrada:");
            entrada = teclado.nextLine();

            if(!entrada.isEmpty())
            {
                entrada = entrada.replace(" ", "");

                //percorre entrada sem espaços
                for (int i = 0; i < entrada.length(); i++)
                    colocaNaPilhaPosFixada(entrada.charAt(i), pilhaInfixa, pilhaResultados, pilha_pos_abre_parenteses);

                System.out.println("Resultado = " + pilhaResultados.pop());
            }
        }
    }

    public static void colocaNaPilhaPosFixada(char aux,  Pilha pilhaInfixa,
                                              PilhaGenerica<Integer> pilhaResultados,
                                              PilhaGenerica<Integer> pilha_pos_abre_parenteses)
    {
        int fechaParentesesIndex = 0;
        int charindex = 0;
        int distanciaParenteses = 0;
        int x, y;
        char operacao;
        String operacoes="+-*/";

        if(aux != ')')
            pilhaInfixa.adicionaNaPilha(aux);
        if(aux == '(')
            pilha_pos_abre_parenteses.push(pilhaInfixa.getTopo() - 1);
        if(aux == ')')
        {
            fechaParentesesIndex = pilhaInfixa.getTopo();
            charindex = pilha_pos_abre_parenteses.pop();
            distanciaParenteses = fechaParentesesIndex - charindex;
            if(distanciaParenteses == 4)
            {
                x = Character.getNumericValue(pilhaInfixa.retornaPrimeiroItemEapaga());
                operacao = pilhaInfixa.retornaPrimeiroItemEapaga();
                y = Character.getNumericValue(pilhaInfixa.retornaPrimeiroItemEapaga());
                pilhaInfixa.retornaPrimeiroItemEapaga(); //apaga o parenteses
                pilhaResultados.push( fazConta(x,y, operacao) );
            }
            else if( distanciaParenteses == 2)
            {
                pilhaResultados.push(fazConta(pilhaResultados.pop(), pilhaResultados.pop(), pilhaInfixa.retornaPrimeiroItemEapaga()));
                pilhaInfixa.retornaPrimeiroItemEapaga();
            }
            else if( distanciaParenteses == 3)
            {
                char aux1=' ';
                int valor_inteiro=0;

                // ou numero ou caracter de operação
                aux1 =pilhaInfixa.retornaPrimeiroItemEapaga();

                if(operacoes.contains(aux1+"")) //se primeiro item é +,-,*,/
                {
                    operacao = aux1;
                    valor_inteiro = Character.getNumericValue(pilhaInfixa.retornaPrimeiroItemEapaga());
                }
                else
                {
                    valor_inteiro = Character.getNumericValue(aux1);
                    operacao = pilhaInfixa.retornaPrimeiroItemEapaga();
                }
                pilhaInfixa.retornaPrimeiroItemEapaga(); // tira o (

                pilhaResultados.push(fazConta(pilhaResultados.pop(), valor_inteiro, operacao));
            }
        }
    }

    public static int fazConta(int x, int y, char operacao)
    {
        switch (operacao)
        {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return  x / y;
            default:
                return 0;
        }
    }
}