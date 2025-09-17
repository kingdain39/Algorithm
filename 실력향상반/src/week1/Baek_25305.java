package week1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Baek_25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cutLine = sc.nextInt();
		ArrayList<Integer> score =  new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			score.add(sc.nextInt());
		}
		score.sort(Comparator.reverseOrder());
		
		System.out.println(score.get(cutLine-1));

	}

}
