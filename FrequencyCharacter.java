package assignment.june21;

public class FrequencyCharacter {

	public static void main(String[] args) {
		
		String str = "Study Tonight";  
        int[] freq = new int[str.length()];  
        System.out.println("The entered string is "+str);
        
        
        //Convert the given string into character array  
        char str1[] = str.toCharArray();            
        for(int i = 0; i <str.length(); i++) 
        {  
            freq[i] = 1;      //Initialize each element of the frequency array as 1.
            
            for(int j = i+1; j <str.length(); j++) 
            {  
                if(str1[i] == str1[j])
                {                          //If the element occurs again, increment the value in the frequency array.
                    freq[i]++;  
                      
                    
                    //Set str1[j] to 0 to avoid printing visited character  
                    str1[j] = '0';  
                }  
            }  
        } 
        
        
        //Displays the characters and their corresponding frequency  
        System.out.println("Frequencies of the characters in the string are as below: "); 
       
        for(int i = 0; i <freq.length; i++) 
        {  
            if(str1[i] != ' ' && str1[i] != '0')  
                System.out.println(str1[i] + " " + freq[i]);  
        }

	}

}
