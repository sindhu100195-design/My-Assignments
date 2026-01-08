package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// Find if the number is prime or not
		int n=9;
		
		boolean prime= true;
		
		for (int i=2;i<n;i++) {
		
		   if (n%i == 0) {
			   prime=false;
			   break;
		   }
		}
		if(prime == true) {
			   System.out.println("Prime Number");
		   }
		else
		       System.out.println("the Number is not a prime:"+n); 
	 }   
	
}


