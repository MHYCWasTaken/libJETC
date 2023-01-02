package galois_field;

public class GaloisFieldNum {

	private int fieldSize;

	private int num;

	public GaloisFieldNum(int fieldSize, int num) {
		this.fieldSize = fieldSize;
		this.num = num;
	}

	public GaloisFieldNum() {

	}

	public GaloisFieldNum plus(GaloisFieldNum n) throws Exception {
		if(n.getFieldSize() != this.fieldSize) {
			throw new Exception("Error: Two galois field number are not in same field.");
		}
		return new GaloisFieldNum(this.fieldSize, this.num ^ n.getNum());
	}

	public int getFieldSize() {
		return fieldSize;
	}

	public int getNum() {
		return this.num;
	}
	
}
