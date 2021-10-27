package myList;

import static org.junit.Assert.assertEquals;

public class main {

	public static void main(String[] args) throws Exception {
		
		MyList<String> ml = new MyList<String>();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		//ml.add(2);
		System.out.println(ml.toString());
		System.out.println(ml.sumLetters());
		
		
		MyList<String> l = new MyList<String>();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
	
		System.out.println(l.get(0));

	}


}
