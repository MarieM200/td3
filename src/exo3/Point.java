package exo3;

public class Point {
	private final int x;//correction -> grace à final, un point ne pourra pas etre changé :
	//pour translate on ne veut pas modifier le point ms en créer un nouveau qui sera l'image de 
	//celui passé en paramètre 
	private final int y;//correction
	public static int i = 0;
	
	public Point(int px, int py) {
		// TODO Auto-generated constructor stub
		this.x = px;
		this.y = py;
		i ++;
	}
	
	public Point(Point p2) {
		// TODO Auto-generated constructor stub
		this.x = p2.x;
		this.y = p2.y;
		i++;
	}
	
	public void afficher() {
		//Point p = new Point();
		System.out.println(this.x + " " + this.y + " i: " + i);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSameAs(Point p) {
		if(p.x == this.x && p.y==this.y) return true;
		return false;
	}
	
	public Point translate(int dx, int dy) { 
		Point p = new Point(this.x + dx, this.y + dy);//correction
		return p;
	}
	
}
