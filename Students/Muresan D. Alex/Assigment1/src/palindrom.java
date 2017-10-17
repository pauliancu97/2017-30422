
public class palindrom {
	   public static int pal (int n)
	  	{
		  int aux=n;
		  int og=0;;
		  while(aux>0)
		  	{
			  og=og*10+aux%10;
			  aux=aux/10;
		  	}
		  if(og==n)
			  return 1;
		  else 
			  return 0;
	  	}

	public static void main(String[] args) {
		int i,j,max;
		max=0;
		for(i=9999;i>0;i--)
			for(j=9999;j>0;j--)
				if(pal(i*j)==1)
					if(i*j>max)
						max=i*j;

	System.out.println(max);
	}

}
