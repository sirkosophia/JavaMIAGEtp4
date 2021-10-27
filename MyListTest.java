package myList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyListTest {

	@Test
	public void sizeList() throws Exception {
		MyList<String> l = new MyList<String>();
		l.add("toto");
		l.add("toto");
		assertEquals(2, l.size());
	}
	
	@Test
	public void sizeList2() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("z");
		l.add("toto");
		l.add("toto");
		l.addLast("ez");
		assertEquals(4, l.size());
	}
	

	@Test
	public void printList() throws Exception {
		MyList<String> l = new MyList<String>();
		l.add("toto");
		l.add("toto");
		l.add("titi");
		assertEquals("titi, toto, toto", l.toString());
	}

	
	

	@Test
	public void addList() throws Exception {
		MyList<String> l = new MyList<String>();
		l.add("toto");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		assertEquals("doh, titi, toto, toto, bla, bli", l.toString());
	}
	

	@Test
	public void addList2() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		assertEquals("doh, titi, toto, toto2, bla, bli", l.toString());
	}
	
	@Test
	public void getList1() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		assertEquals("doh", l.get(0));
	}
	
	@Test
	public void getList2() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		assertEquals("toto", l.get(2));
	}

	@Test(expected=IllegalArgumentException.class)
	public void getInvalid() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("toto2");
		l.get(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getInvalid2() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("toto2");
		l.get(10);
	}

	
	@Test
	public void sumLetterTest() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("totoo");
		l.add("toto");
		l.add("titi");
		assertEquals(13, l.sumLetters());
	}
	
	@Test(expected=NullPointerException.class)
	public void addNull() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("totoo");
		l.add(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void addNull2() throws Exception {
		MyList<String> l = new MyList<String>();
		l.addLast("totoo");
		l.addLast(null);
	}
	

	@Test(expected=NullPointerException.class)
	public void sumNull() throws Exception {
		MyList<String> l = new MyList<String>();
		l.add("totoo");
		l.add(null);
		assertEquals(5, l.sumLetters());
	}

	
	@Test(timeout=1000)
	public void toStringSpeed() throws Exception {
		MyList<String> l = new MyList<String>();
		for(int i=0;i<100000;i++) {
			l.add(Integer.toString(i));
		}
		l.toString();		
	}
	

}