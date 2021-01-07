//백준 1932
//동적 계획법
//참고:https://st-lab.tistory.com/131

//7
//3 8
//8 1 0
//2 7 4 4
//4 5 2 6 5
import java.util.*;
public class p2 {
	public static int arr[][];
	public static Integer sum[][];
	public static int n;
	
	public static int find(int depth, int idx) {
		//depth:행, idx:열
		if(depth==n-1)
			return sum[depth][idx];
		if(sum[depth][idx] == null) {
			sum[depth][idx] = Math.max(find(depth+1,idx), find(depth+1, idx+1))+arr[depth][idx];
		}
		return sum[depth][idx];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		sum = new Integer[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//밑에서부터 시작
		//삼각형의 밑 변에 있는 값들은 그대로
		//위로 올라가면서 합을 최대로 만든다.
		
		for(int i=0; i<n; i++) {
			sum[n-1][i]=arr[n-1][i];
		}
		
		System.out.println(find(0,0));
		
		//현재
		//
		//
		//
		//
		//4 5 2 6 5
		
		//find(0,0);
		//sum[0][0]==null
		//sum[0][0]=Math.max(find(1,0),find(1,1))+arr[0][0]
		//find(1,0): 
		//sum[1][0]==null
		//sum[1][0]=Math.max(find(2,0),find(2,1))+arr[1][0]
		//...
		//이렇게 가면서 결국에는 밑변까지 가서 둘 중에 최댓값에 해당 자리의 값을 더한 값이 나오게 된다.
		
	}
}
