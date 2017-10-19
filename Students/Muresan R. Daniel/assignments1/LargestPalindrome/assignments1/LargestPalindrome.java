package assignments1;

public class LargestPalindrome {
	
	public static boolean checkPalindrome(int n) {
		int original,reversed;
		reversed=0;
		original=n;
		while(n!=0) {
			reversed=reversed*10+n%10;
			n=n/10;
		}
		if(original==reversed)
			return true;
		else
			return false;
	} 

	public static void main(String[] args) {
		int largestPalindrome=0,i=999;
		do {
		    for(int j=i;j>100;j--)
		    	if(checkPalindrome(i*j)==true) {
		    		largestPalindrome=i*j;
		    		break;
		    	}
		    i--;			
		}while(largestPalindrome==0);
		System.out.println(largestPalindrome);
	}
}