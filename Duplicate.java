package assignment.june21;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 12244;
		long prev_digit = n % 10;
	     
        // Initialize power
        long pow = 10;
        long res = prev_digit;
     
        
        while (n>0) {
             
            // Store current digit
        	
            long curr_digit = n % 10;
     
            if (curr_digit != prev_digit)
            {
                // Add the current digit to
                // the beginning of result
            	
                res += curr_digit * pow;
     
                // Update previous result
                // and power
                prev_digit = curr_digit;
                pow *= 10;
            }
     
            // Remove last digit from n
            n = n / 10;
        }
     
        System.out.println(res);
		
		
	}
}
