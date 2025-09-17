package week1;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Baek_10798 {
		
		public static void main(String[] args) throws Exception {
			//일단 읽어야하니까 br생성
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        
	        String[] row = new String[5];
	        for (int i = 0; i < 5; i++) row[i] = br.readLine();

	        StringBuilder sb = new StringBuilder();
	        for (int col = 0; col < 15; col++) {
	            for (int r = 0; r < 5; r++) {
	            	//만약 요청하는 열(col)이 해당 행의 문자열길이보다 적으면 OK
	            	//만약 그렇지 않구 크다면 굳이 뭘 하지 않고 그냥 넘어감.
	            	//String result(이어 붙이기 할 때 마다 매번 새 문자열 생성) 대신 StringBuilder br에 쭉쭉 이어 붙임
	                if (col < row[r].length()) sb.append(row[r].charAt(col));
	            }
	        }
	        System.out.print(sb);
	    }

}
