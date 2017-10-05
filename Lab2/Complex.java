
public class Complex {
	
	private int a;
	private int b;
	
	public Complex(){
		a = 0;
		b = 0;
	}
	
	public Complex(int a){
		this.a = a;
		b = 0;
	}
	
	public Complex(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public String toString(){
		if(b == 0)
			return("" + a);
		else return(a + " + " + b + "i" );
	}
	
	public int getRealPart(){
		return a;
	}
	
	public int getImaginaryPart(){
		return b;
	}
	
	public Complex add(Complex c){
		int q = a + c.getRealPart();
		int r = b + c.getImaginaryPart();
		return new Complex(q,r);
	}
	
	public Complex subtract(Complex c){
		int q = a - c.getRealPart();
		int r = b - c.getImaginaryPart();
		return new Complex(q,r);
	}
	
	public Complex multiply(Complex c2){
		int c = c2.getRealPart();
		int d = c2.getImaginaryPart();
		int q = a * c - b * d;
		int r= b * c - a * d;
		return new Complex(q,r);
	}
	
	public Complex divide(Complex c2){
		int c = c2.getRealPart();
		int d = c2.getImaginaryPart();
		int q = a * c - b * d;
		int r = b * c - a * d;
		int sq = c * c + d * d;
		q /= sq;
		r /= sq;	
		return new Complex(q,r);
	}
	
}
