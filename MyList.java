package myList;

public class MyList<M> {
	private Cell<M> firstCell;
	private static int size = 0;
	
	public MyList() {
		size = 0;
	}
	
	public MyList(Cell<M> c) {
		this.firstCell = c;
		size = 0;
	}

	public Cell<M> getFirstCell() {
		return firstCell;
	}

	public void setFirstCell(Cell<M> firstCell) {
		this.firstCell = firstCell;
	}
	
	public void add(M s)throws Exception {
		if (s == null) {
			throw new NullPointerException();
		}
		else {
			Cell<M> ctem = firstCell;
			Cell<M> c = new Cell<M>(s, ctem);
			firstCell = c;
			size++;
		}
	}
	
	public int size() {
		/*
		int size = 0;
		Cell c = firstCell;
		if (c != null) {
			size = 1;
			while (c.next()){
				size++;
				c = c.getCellNext();
			}
		}	
		*/
		return size;
	}

	@Override
	public String toString() {
		Cell<M> c = firstCell;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.size()- 1; i++) {
			sb.append(c.toString() + ", ");
			c = c.getCellNext();
		}
		sb.append(c.toString());
		return sb.toString();
	}
	
	public void addLast(M str)throws Exception {
		if (str == null) {
			throw new NullPointerException();
		}
		else {
			Cell<M> c = firstCell;
			if (c != null) {
				while (c.next()){
					c = c.getCellNext();
				}
				c.setCellNext(new Cell<M>(str));
				
			}
			else {
				this.setFirstCell(new Cell<M>(str));
			}
			size++;
		}
	}
	
	public void add (M str, int i) throws Exception {
		if (str == null) {
			throw new NullPointerException();
		}
		else {
			Cell<M> c = firstCell;
			if ((i == 0) && (c != null)){
				c.setCellNext(new Cell<M>(str));
			}
			if (i<= this.size() - 1) {
				for (int j = 0; j < i; j++) {
					c = c.getCellNext();
				}
				c.setCellNext(new Cell<M>(str, c.getCellNext()));
			}
			else {
				throw new Exception("i is out of range");
			}
			size++;
		}
	}
	
	public Object get(int index) throws Exception{
		Cell<M> c = firstCell;
		if (index<= this.size() - 1 && index >= 0) {
			for (int j = 0; j < index; j++) {
				c = c.getCellNext();
			}
			return c.getM();
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public int sumLetters() {
		int res = 0;
		Cell<M> c = firstCell;
		for (int i = 0; i < this.size(); i++) {
			res += String.valueOf(c.getM()).length();
			c = c.getCellNext();
		}
		return res;
	}
	
	public Boolean contains(M o) {
		Boolean res = false;
		Cell<M> c = firstCell;
		for (int i = 0; i < this.size(); i++) {
			res = c.getM() == o;
		}
		return res;
	}
	

}
