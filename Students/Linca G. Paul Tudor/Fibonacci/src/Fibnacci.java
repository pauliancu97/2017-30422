import java.util.*;
public class Fibnacci {

	public static void main(String[] args) 
	{
	        int sum = 0, first = 1, second = 1, i, next;
	        
	        for (i = 0; i < 4000000; i++) 
	        {
	        	next = first + second;
	        	if(next >= 4000000)
	        	{
	        		next = next - second;
	        		break;
	        	}
	        	first = second;
	        	second = next;
	        	if(next % 2 == 0)
	        		sum += next;
	        }
	        System.out.print(sum);
	    }
}
