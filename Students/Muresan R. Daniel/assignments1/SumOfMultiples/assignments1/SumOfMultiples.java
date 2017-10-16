package assignments1;

import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		int sumOfMultiples=0;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		for(int i=0;i<num;i++) {
			if (i%3==0 || i%5==0)
				sumOfMultiples=sumOfMultiples+i;
		}
		System.out.println(sumOfMultiples);

	}

}
