package Lista_4_.estrutura;

public class ListaOrdenada extends Lista
{
	public void insere(int novo)
	{
		Elo p, q;
		Elo ant = null;
		
		q = new Elo(novo);
		
		for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;
		
		q.prox = p;
	}

	public boolean remove(int elem)
	{
		Elo p;
		Elo ant = null;
		
		for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
			ant = p;

		if ((p == null) || (p.dado != elem))
			return false;
		
		if (p == prim)
			prim = prim.prox;
		else
			ant.prox = p.prox;
		p = null;
		
		return true;
	}

	public static ListaOrdenada concatenaOrdenada(ListaOrdenada l1, ListaOrdenada l2)
	{
		ListaOrdenada l3 = new ListaOrdenada();
		Elo p = l1.prim, q = l2.prim;

		if(l1.vazia())
		{
			return l2;
		}
		if(l2.vazia())
		{
			return l1;
		}
		else
		{
			while (p != null) {
				l3.insere(p.dado);
				p = p.prox;
			}
			while (q != null) {
				l3.insere(q.dado);
				q = q.prox;
			}
		}
		return l3;
	}
}