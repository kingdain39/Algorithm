package week1;

import java.util.Scanner;

public class Baek_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnst=n-(int)(Math.log10(n)+1)*9;
		int result=0;
		
		
		while(cnst<n) {
			
			int sum=cnst;
			int cnstDup = cnst;
			while(cnstDup!=0) {
				sum+=cnstDup%10;
				cnstDup/=10;
			}
			if(n==sum) {
				result = cnst;
				break;
			}
			cnst++;
		}
		
		System.out.println(result);
		

	}

}
