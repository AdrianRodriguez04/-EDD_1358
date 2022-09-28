package fes.aragon.lista.doblemente.ligada;

public class PruebaNodoD {

	public static void main(String[] args) {
		
		NodoDoble<Integer> head;
		head = new NodoDoble<Integer>(1);
		NodoDoble<Integer> nuevo = new NodoDoble<Integer>(4, null, head);
		head.setSiguiente(nuevo);
		nuevo = null;
		
		NodoDoble<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp);
			temp = temp.getSiguiente();
		}

	}
}
