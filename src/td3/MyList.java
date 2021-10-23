package td3;

public class MyList<T> {
	private Cell<T> first;
	
	public MyList() {
		// TODO Auto-generated constructor stub
		this.first = null;
	}
	
	public MyList(Cell<T> first) {
		// TODO Auto-generated constructor stub
		this.first = first;
	}
	
	public void add(T v) {
		Cell<T> c = new Cell<T>(v, this.first);
		this.first = c;
	}
	
	public int size(){
		int i = 0;
		Cell<T> temp = new Cell<T>(this.first);
		while(temp.getNext() != null) {
			i++;
			temp = temp.getNext();
		}
		return i;
	}
	
	public String toString() {
		String m = "Valeurs : ";
		Cell<T> temp = new Cell<T>(this.first);
		while(temp.getNext() != null) {
			m = m + temp.getValeur() + " ";
			temp = temp.getNext();
		}
		m = m + temp.getValeur();
		return m;
	}
	
	public void addLast(T v) {
		Cell<T> nouveau = new Cell<T>(v);
		if(first == null) {
			this.first = nouveau;
		}
		else {
			Cell<T> temp = new Cell<T>(this.first);
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.modifNext(nouveau); 
		}
	}
	
	public void add(T v, int i) {
		int j = 0;
		Cell<T> nouveau = new Cell<T>(v);
		Cell<T> temp = new Cell<T>(this.first);
		while(j != i) {
			j++;
			temp = temp.getNext();
		}
		nouveau.modifNext(temp.getNext());
		temp.modifNext(nouveau);
	}
	
	public T get(int i) {
		int j = 0;
		Cell<T> temp = new Cell<T>(this.first);
		while(j != i) {
			j++;
			if (temp.getNext() != null) {
				temp = temp.getNext();
			}
			else {
				return (T) "l'indice ne correspond a aucune cellule";
			}
		}
		return temp.getValeur();
	}
	
	public int sumLetters() {
		int i = 0;
		Cell<T> temp = new Cell<T>(this.first);
		while(temp.getNext() != null) {
			if(temp.getValeur() instanceof String) {
				String val;
				val = (String) temp.getValeur();
				i = i + val.length();
			}
			temp = temp.getNext();
		}
		return i;
	}
	
	public boolean contains(T o) {
		Cell<T> temp = new Cell<T>(this.first);
		while(temp.getNext() != null) {
			if(temp.getValeur().equals(o)) return true;
			temp = temp.getNext();
		}
		return false;
	}
}
