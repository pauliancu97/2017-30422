
public class Palindrome {

	public static void main(String[] args) 
	{
		int i, j, product, max = -1 ;
	    for(i = 999; i > 100; i--)
	    {
	        for(j = 999; j > 100; j--)
	        {
	            product = j * i;
	            if(isPalindrome(product))
	            	if(product > max) max = product;
	        }
	    }
        System.out.print(max);

	}
	                

	
	public static boolean isPalindrome(int integer) {
	    int palindrome = integer;
	    int reverse = 0;


	    while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }

	    return integer == reverse;

	}
}