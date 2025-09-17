package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Baek_10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		int n1 = sc.nextInt();
		ArrayList<Integer> sang = new ArrayList<Integer>();
		for(int i=0; i<n1; i++) {
			sang.add(sc.nextInt());
		}
		int n2 = sc.nextInt();
		ArrayList<Integer> numCard = new ArrayList<Integer>();
		for(int i=0; i<n2; i++) {
			numCard.add(sc.nextInt());
		}
	
		
		for(Integer i: numCard) {
			if(sang.contains(i)) {
				result+="1 ";
			}
			
			else {
				result+="0 ";
			}
		}
		System.out.println(result);

	}

}
