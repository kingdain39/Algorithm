package week1;

import java.util.Scanner;

public class Baek_2941 {
public static void main(String[]args) {
		
		
		int cnt=0;
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='c' && i<s.length()-1) {
				if(s.charAt(i+1)=='=' || s.charAt(i+1)=='-') {
					i++;
				}
			}
			else if(s.charAt(i)=='d' && i<s.length()-1) {
				
					if(s.charAt(i+1)=='z' && i<s.length()-2) {
						if(s.charAt(i+2)=='='){
							i+=2;
						}
					}
				
					else if(s.charAt(i+1)=='-') {
						i++;
					}
				}
			
			
			else if(s.charAt(i)=='l' && i<s.length()-1) {
				if(s.charAt(i+1)=='j') {
					i++;
				}
			}
			
			else if(s.charAt(i)=='n' && i<s.length()-1) {
				if(s.charAt(i+1)=='j') {
					i++;
				}
			}
			
			else if(s.charAt(i)=='s' && i<s.length()-1) {
				if(s.charAt(i+1)=='=') {
					i++;
				}
			}
			
			else if(s.charAt(i)=='z' && i<s.length()-1) {
				if(s.charAt(i+1)=='=') {
					i++;
				}
			}
			cnt++;
		}

		System.out.println(cnt);
	}

}
