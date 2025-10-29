package Lista_2_.estrutura;

import java.util.Vector;

public class PilhaGenerica<T> {
    public int n;
    public Vector<T> vetor;
    public int topo = -1;
    public int tamanhoMaximoOcupado = 0, qntElementos = 0;

    public PilhaGenerica(){
        n = 13;
        vetor = new Vector<>(n);
    }

    public PilhaGenerica(int tamanho){
        n = tamanho;
        vetor = new Vector<>(n);
    }

    public boolean isVazia(){
        if(topo == -1){
            return true;
        } else{
            return  false;
        }
    }

    public boolean isCheia(){
        if(topo == n - 1){
            return true;
        } else{
            return false;
        }
    }

    public boolean push(T letra){
        if(isCheia()) { // se estiver cheia
            System.out.println("Está cheia");
            return true;

        } else { //se não estiver cheia, e não for c, insere
            this.vetor.add(++topo, letra);
            tamanhoMaximoOcupado++;
            qntElementos++;
            return false;
        }
    }

    public T pop(){
        if(!isVazia()){
            T valorTopo = vetor.get(topo--);
            qntElementos--;
            return valorTopo;

        } else{
            System.out.println("Pilha vazia!");
            return null;
        }
    }
}