package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek_11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result=0;
		int wait=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringTokenizer st; st = new StringTokenizer(br.readLine()," "); 
		for(int i=0; i<n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		arr.sort(Comparator.naturalOrder());
		
		for(int i=0; i<arr.size(); i++) {
			
			result+=wait+arr.get(i);
			wait += arr.get(i);
		}
		
	System.out.println(result);

	}

}
