package Lista_4_;

import Lista_4_.estrutura.ListaOrdenadaGenerica;

public class MainEx6
{
    public static void main(String []args)
    {
        ListaOrdenadaGenerica diretorio = new ListaOrdenadaGenerica();
        ListaOrdenadaGenerica pasta1 = new ListaOrdenadaGenerica();
        ListaOrdenadaGenerica pasta2 = new ListaOrdenadaGenerica();
        ListaOrdenadaGenerica pasta3 = new ListaOrdenadaGenerica();

        pasta1.insere("Pasta Jogos");
        pasta1.insere("Campo Minado");
        pasta1.insere("Paciência");
        pasta1.insere("World of Warcraft");


        pasta3.insere("Pasta ACEs");
        pasta3.insere("ACE1");
        pasta3.insere("ACE2");
        pasta3.insere("ACE3");


        pasta2.insere("Pasta Faculdade");
        pasta2.insere("EDD1");
        pasta2.insere("EDD2");
        pasta2.insere("AA");
        pasta2.insere(pasta3);
        pasta2.insere("TPD");


        diretorio.insere(pasta1);
        diretorio.insere(pasta2);
        //atribuições possuem complexidade O(1)

        diretorio.GeraStringPath();
        //método recursivo onde vasculha cada pasta uma dentro da outra
        //possui complexidade O(N^2), onde N= quantidade de itens nas listas

        System.out.println(diretorio);
        // metodo diretorio.toString() sobrescrito reverte a string
        //Possui Complexidade O(N), onde N= quantidade de palavras de entrada
    }
}
