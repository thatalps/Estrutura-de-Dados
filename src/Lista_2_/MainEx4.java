package Lista_2_;

import Lista_2_.estrutura.Fila;
import Lista_2_.estrutura.FilaDupla;

public class MainEx4
{
    public static void main(String []args)
    {
        Fila fila = new Fila(10);
        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.insere(5);

        FilaDupla fd = Fila.FilaCircular(fila);
        fd.imprime();
        System.out.println("modificando:");
        fd.removeFim();
        fd.removeFim();
//        fd.insereInicio(70);
//        fd.insereInicio(80);
        fd.imprime();
    }
}
