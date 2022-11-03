package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	public String add(Fraction f) {
		int addNumerator = numerator*f.denominator + denominator*f.numerator;
		int addDenominator = denominator*f.denominator;
		return addNumerator + "/" + addDenominator;
	}
	
	public String multiply(Fraction f) {
		int multNumerator = numerator*f.denominator + denominator*f.numerator;
		int multDenominator = denominator*f.denominator;
		return multNumerator + "/" + multDenominator;
	}
	
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	
	public int gcd(int p, int q) {
		if (p%q == 0) {
			return q;
		} else {
			return gcd(q, p%q);
		}
	}
	
	public String simplify() {
		int divisor = gcd(denominator, numerator);
		int simNumerator = numerator/divisor;
		int simDenominator = denominator/divisor;
		return simNumerator + "/" + simDenominator;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(5,30);
		Fraction f2 = new Fraction(6,15);
		System.out.println(f1.add(f2));
		System.out.println(f1.multiply(f2));
		System.out.println(f1.reciprocal());
		System.out.println(f1.simplify());
	}

}
