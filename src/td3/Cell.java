package td3;

public class Cell<T> {
	private T valeur;
	private Cell<T> next;
	
	public Cell(T v) {
		// TODO Auto-generated constructor stub
		this.valeur = v;
		this.next = null;
	}
	
	public Cell(T v, Cell<T> n) {
		// TODO Auto-generated constructor stub
		this.valeur = v;
		this.next = n;
	}
	
	public Cell(Cell<T> c) {
		this.valeur = c.getValeur();
		this.next = c.getNext();
	}
	
	public Cell<T> getNext() {
		return this.next;
	}
	
	public T getValeur() {
		return this.valeur;
	}
	
	public void modifNext(Cell<T> n) {
		this.next = n;
	}
}
