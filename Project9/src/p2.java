//���� 1932
//���� ��ȹ��
//����:https://st-lab.tistory.com/131

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
		//depth:��, idx:��
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
		
		//�ؿ������� ����
		//�ﰢ���� �� ���� �ִ� ������ �״��
		//���� �ö󰡸鼭 ���� �ִ�� �����.
		
		for(int i=0; i<n; i++) {
			sum[n-1][i]=arr[n-1][i];
		}
		
		System.out.println(find(0,0));
		
		//����
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
		//�̷��� ���鼭 �ᱹ���� �غ����� ���� �� �߿� �ִ񰪿� �ش� �ڸ��� ���� ���� ���� ������ �ȴ�.
		
	}
}
