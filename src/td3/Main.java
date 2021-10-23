package td3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyList<String> ml = new MyList<String>();
		 ml.addLast("tatu");
		 ml.add("toto");
		 ml.add("titi");
		 ml.addLast("tutu");
		 ml.add("tata", 1);
		 //ml.add(1);
		 System.out.println(ml.toString());
		 System.out.println(ml.get(2));
		 System.out.println(ml.get(5));
		 System.out.println(ml.sumLetters());
	}

}
