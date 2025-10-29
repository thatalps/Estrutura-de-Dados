package Lista_8_.estrutura;

public class HeapBinariaMaxima
{
	private int n;               /* Numero de elementos no heap. */   
	private int tam;             /* Tamanho m�ximo do heap. */
	private int[] vetor;          /* Vetor com elementos. */

	/* Constr�i heap vazio. */
	public HeapBinariaMaxima(int tamanho)
	{
		n = 0;
		tam = tamanho;
		vetor = new int[tamanho+1];
	}

	/* Constr�i heap a partir de vetor v. */
	public HeapBinariaMaxima(int tamanho, int[] v)
	{
		tam = tamanho;
		vetor = new int[tamanho+1];
		n = tamanho;

		for( int i = 0; i < tamanho; i++ )
			vetor[ i + 1 ] = v[ i ];

		constroiHeap();
	}
	public HeapBinariaMaxima(HeapBinariaMinima heapMinima)
	{
		tam = heapMinima.getTam();
		vetor = new int[tam+1];
		n = tam;
		int [] v_aux = heapMinima.getVetor();
		int [] v = new int[tam];

		for(int i =0;i<tam;i++)
			v[i]=v_aux[i+1];

		for( int i = 0; i < tam; i++ )
			vetor[ i + 1 ] = v[ i ];

		constroiHeap();
	}

	public int getTam()
	{return tam;}
	public int getN()
	{return tam;}
	public int[] getVetor()
	{return vetor;}
	/* Testa se a fila de prioridade est� logicamente vazia.
	   Retorna true se vazia, false, caso contr�rio. */
	public boolean vazia()
	{
		return n == 0;
	}

	/* Faz a lista de prioridades logicamente vazia. */
	public void fazVazia()
	{
		n = 0;
	}

	/* Imprime os elementos da heap. */
	public void imprime()
	{
		System.out.print("Conteudo do heap max:");
		for(int i = 1; i <= n; i++)
			System.out.print(vetor[i] + " ");

		System.out.println();
	}
	
	/* Imprime os elementos da heap at� o tamanho m�ximo do vetor, a contar de 1.
	 * Este m�todo � utilizado somente ap�s a aplica��o do Heapsort. */
	public void imprimeTamanho()
	{
		for(int i = 1; i <= tam; i++)
			System.out.print(vetor[i] + " ");
		
		System.out.println();
	}

	/* Busca o maior item na fila de prioridades.
	   Retorna o maior item em itemMin e true, ou falso se a heap estiver vazia. */
	public int max()
	{
		if (this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MIN_VALUE;
		}

		return vetor[1];
	}

	/* Remove o maior item da lista de prioridades e coloca ele em itemMax. */
	public int removeMax()
	{
		int itemMax;
		
		if(this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MIN_VALUE;
		}

		itemMax = vetor[1];
		vetor[1] = vetor[n];
		n--;
		refaz(1);
		
		return itemMax;
	}

	/* M�todo auxiliar que estabelece a propriedade de ordem do heap a 
	 * partir de um vetor arbitr�rio dos itens. */
	private void constroiHeap()
	{
		/* As posições n até a posição (n / 2) + 1 já constituem uma heap,
		 * pois são folhas. */
		for( int i = n / 2; i > 0; i-- )
			refaz(i);
	}

	/* M�todo auxiliar para restaurar a propriedade de heap que
	 * n�o est� sendo respeitada pelo n� i. */
	private void refaz(int i)
	{
		int x = vetor[ i ];

		while(2*i <= n)
		{
			int filhoEsq, filhoDir, maiorFilho;
			
			filhoEsq = 2*i;
			filhoDir = 2*i + 1;
			
			/* Por enquanto, o maior filho � o da esquerda. */
			maiorFilho = filhoEsq;
			
			/* Verifica se o filho direito existe. */
			if(filhoDir <= n)
			{
				 /* Em caso positivo, verifica se � maior que o filho esquerdo. */
				if(vetor[ filhoDir ] > vetor[ filhoEsq ])
					maiorFilho = filhoDir;
			}

			if(vetor[ maiorFilho ] > x)
				vetor [ i ] = vetor[ maiorFilho ];
			else
				break;
			
			/* Como o elemento x que estava na posi��o "i" desceu para o n�vel de baixo, a pr�xima
			 * itera��o vai verificar a possibilidade de trocar esse elemento x (agora na 
			 * posi��o "maiorFilho") com um de seus novos filhos. */
			i = maiorFilho;
		}
		vetor[ i ] = x;
	}

	/* Insere item x na fila de prioridade, mantendo a propriedade do heap.
	 * S�o permitidas duplicatas. */
	public void insere(int x)
	{
		if (tam == n)
		{
			System.out.println("Fila de prioridades cheia!");
			return;
		}

		/* O elemento � inicialmente inserido na primeira posi��o dispon�vel
		 * na �rvore, considerando de cima para baixo, da esquerda para a direita. */
		n++;
		int pos = n;
		
		/* Sentinela utilizada para tratar o caso do pai do n� raiz (de �ndice 1). */
		vetor[0] = x;

		/* Refaz heap (sobe elemento). */
		while(x > vetor[pos/2])
		{
			vetor[pos] = vetor[ pos/2 ];
			pos /= 2;
		}
		
		vetor[pos] = x;
	}

	/* Implementa o algoritmo de ordena��o Heapsort. */
	public void heapsort()
	{
		int cont_iteraçoes=0;
		int x;           
		int resta = n;
		int raiz = 1;
		System.out.println("\nConstroi heap com estrutura válida\n");
		constroiHeap();

		System.out.println("Heap a ser utilizado na primeira iteração:");
		imprimeTamanho();
		while (resta > 1)
		{cont_iteraçoes++;
			System.out.println("Joga a raiz para o final -> "+ vetor[raiz]);
			x = vetor[raiz];
			vetor[raiz] = vetor[resta];
			vetor[resta] = x;
			resta--;
			n--;
			System.out.println("Refaz estrutura colocando raiz local sendo ->"+ vetor[resta]+ " e colocando como folha ->"+vetor[raiz]);
			refaz(raiz);
			System.out.println("Heap refeito:\t ignore o(s) ultimo(s) "+cont_iteraçoes+" item(ns) ");
			imprimeTamanho();
			System.out.println("Heap há ser modificado na proxima iteração");
			imprime();
			System.out.println("\n\n");
		}
	}
	public boolean verificaPropriedadeHeap(int[] vetor)
	{
		boolean validacao = true;
		int contItens = n;
		if(n>1)
		{
			for(int i =0; i<contItens;i+=3)//5 4 3 2 1
			{
				if(i+1 < contItens)
					if(vetor[i]>vetor[i+1]) // 5>4
					validacao = true;
					else
					 return validacao = false;

				if(i+2 < contItens) // tem +1 item pra frente ?
					if(vetor[i]>vetor[i+2]) // 5>3
						validacao = true;
					else
						return validacao = false;

			}
		}
		return validacao;
	}

	public boolean remove(int i)
	{
		if(n<i)
			return false;
		else
		{
			System.out.println("remover item de indice "+i+" -> "+ vetor[i]);
			int aux=0;
			aux =vetor[i];// pega posicao pra remover
			vetor[i]=vetor[n]; //coloca uma folha nele
			n--; //ignora o ultimo item/folha que foi colocada na posicao i
			constroiHeap();
			return true;
		}
	}
}