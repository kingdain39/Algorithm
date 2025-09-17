package week1;

import java.util.Scanner;

public class Baek_2738 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  
		int k = sc.nextInt();
		
		int[][] arr1 = new int[n][k];
		int[][] arr2 = new int[n][k];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
			
			
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
			
			
		}
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
