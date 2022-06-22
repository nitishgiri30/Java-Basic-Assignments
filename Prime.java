package assignment.june21;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		  int num = 29;
		    int temp=0;
		    
		    for (int i = 2; i <= num-1; i++) {
		    	
		      // condition for nonprime number
		    	
		      if (num % i == 0) {
		            temp=temp+1;
		      }
		    }

		    if (temp==0)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	}

}
