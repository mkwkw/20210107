//백준 1932
//동적 계획법
import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		int sum[] = new int [2^n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		sum[0]=arr[4][0]+arr[3][0]+arr[2][0]+arr[1][0]+arr[0][0];
		sum[1]=arr[4][1]+arr[3][0]+arr[2][0]+arr[1][0]+arr[0][0];
		sum[2]=arr[4][1]+arr[3][1]+arr[2][0]+arr[1][0]+arr[0][0];

		for(int k=0; k<n ; k++) {//n...?
			for(int i=0; i<n; i++) {
				for(int j=0; j<i+1; j++) {
					
				}
			}
	
		}
	}
}
