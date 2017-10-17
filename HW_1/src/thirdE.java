
public class thirdE {
	
	/*Method to verify if the number is palindrom or not.*/
	public static int palindromverif(int sample) {
		int localSample = sample;
		int reverse=0;
		while(localSample>0) {
			reverse = localSample % 10 + reverse*10;
			localSample = localSample/10;
		}
		if(reverse==sample)
			return 1;
		else
			return 0;
		
	}
	
	/*A method for which the digit number is given.
	 * Knowing this, the function generates the limits between the two
	 * operands should be. Then applies the palindrom verifying method.*/
	public static int generalizedPalindrom(int digit_Number) {
		//set the limits of the numbers
		int upLimit=0,lowLimit;
		int i,j;
		int currentProduct=0, maxProduct=0;
		for(i=0;i<digit_Number;i++) {
			upLimit*=10;
			upLimit+=9;
		}
		lowLimit = upLimit / 10;
		for(i=upLimit;i>=lowLimit;i--) {
			for(j=i;j>=lowLimit;j--) {
				currentProduct = i*j;
				if(currentProduct<maxProduct)
					break;
				if((palindromverif(currentProduct)==1) && (currentProduct > maxProduct)) {
					maxProduct = currentProduct;
				}
			}
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		
		int i,j,currentProduct=0,maxProduct=0;
		
		for(i=999;i>=100;i--) {
			for(j=i;j>=100;j--) {
				
				currentProduct = i*j;
				if (currentProduct < maxProduct)
					break;
				
				if ((palindromverif(currentProduct) == 1) && (currentProduct > maxProduct)){
					
						maxProduct = currentProduct;
					
				}
			}
		}
		
		System.out.println("In the case of 3 digit numbers:");
		System.out.println(maxProduct + "\n");
		
		System.out.println("In the case of 4 digit numbers:");
		System.out.println(generalizedPalindrom(4));
	}

}
