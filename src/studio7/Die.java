package studio7;

public class Die {
	
	private int numOfSides;
	private int[] sideArray; 
	
	public Die(int initNumOfSides) {
		numOfSides = initNumOfSides;
	}
	
	public int getNumber() {
		return (int) (Math.random()*numOfSides + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d = new Die(10);
		System.out.println(d.getNumber());
	}
}
