package assignment.june21;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6, sum = 0;

		for(int i = 1; i < n; i++)
		{
		   if(n % i == 0)
		    {
		      sum = sum + i;
		    }
		}
		
		if(sum == n)
		{
		System.out.println("The number is Perfect");
		}
		
		else
		{
		System.out.println("The number is not Perfect");
		}
	}

}
