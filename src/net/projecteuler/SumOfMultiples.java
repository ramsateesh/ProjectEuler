package net.projecteuler;

public class SumOfMultiples {

	public static int below(int a, int b, int n) {
		int sum = 0;
		int i = (a < b ? a : b);
		int j = (a < b ? b : a) ;
		
		
		for(int i1 = i, j1 = j; i1 < n; i1 += i, j1 +=j) {
			if(i1 < n && i1 % j != 0) sum += i1;
			if(j1 < n ) sum += j1;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(SumOfMultiples.below(3, 5, 1000));
	}

}
