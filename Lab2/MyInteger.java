
public class MyInteger {

	private int myInt;
	
	public MyInteger(int n){
		myInt = n;
	}
	
	public boolean isEven(){
		return (myInt%2==0);
	}
	
	public boolean isOdd(){
		return(!isEven());
	}
	
	public boolean isPrime(){
		if(myInt<=2)
			return true;
		int i = 2;
		while(i<=myInt/2){
			if(myInt%i==0)
				return false;
			i++;
		}
		return true;
	}
	
	public int getInt(){
		return myInt;
	}
	
	public static boolean isEven(int a){
		MyInteger newInt = new MyInteger(a);
		return newInt.isEven();
	}
	
	public static boolean isOdd(int a){
		MyInteger newInt = new MyInteger(a);
		return newInt.isOdd();
	}
	
	public static boolean isPrime(int a){
		MyInteger newInt = new MyInteger(a);
		return newInt.isPrime();
	}
	
	public static boolean isEven(MyInteger newInt){
		return newInt.isEven();
	}
	
	public static boolean isOdd(MyInteger newInt){
		return newInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger newInt){
		return newInt.isPrime();
	}
	
	public boolean equals(int a){
		return myInt ==a;
	}
	
	public boolean equals(MyInteger a){
		return myInt == a.getInt();
	}
	
	public static int parseInt(String str){
		    int i = 0;
		    int num = 0;
		    while( i < str.length()) {
		        num *= 10;
		        num += str.charAt(i++) - '0';
		    }
		    return num;
		}
	
	
}
