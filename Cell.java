package myList;

public class Cell<M> {
	private M m;
	private Cell cellNext;
	
	public Cell (M m, Cell c) {
		this.m = m;
		cellNext = c;
	}
	
	public Cell (M m) {
		this.m = m;
	}	
	
	public Cell() {}
	

	public Object getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}

	public Cell<M> getCellNext() {
		return cellNext;
	}

	public void setCellNext(Cell<M> cellNext) {
		this.cellNext = cellNext;
	}
	
	public Boolean next() {
		return (cellNext != null);
	}

	@Override
	public String toString() {
		return m + "";
	}
	
	
	

}
