//���� 13305
//�׸���

//����
//4
//2 3 1
//5 2 4 1

//	2   3   1
//5	  2   4   1

//�ϴ� price[idx]*distance[idx]
//price[idx-1]�� price[idx]���� �۴ٸ� price[idx]��ſ� price[idx-1]
//��
//�� Ʋ������?
import java.util.*;

public class p1 {
	
	private static int city; //������ ����
	private static int distance[]; //���� ������ �Ÿ�
	private static int tdistance; //�Ÿ� ����
	private static int pdistance;
	private static int price[]; //������ ����
	private static int result; //���: �ּ� ���
	private static int small; //�� ����
	
	
	
	private static int find(int idx) {
		//ù��° �������� ������ �ּҰ��� �ƴ϶�� ���� ������ ����ŭ�� �����Ѵ�.
		//result += price[0]*distance[0];
		//ù��° �������� ������ ���� ������ �� �Ÿ���ŭ �����Ѵ�.
		//result += price[0]*(��ü�Ÿ�);
		
		
		//�ι�° �̻� �������� ������ ���� ���ݺ��� ������ �� �Ÿ�-�����Ÿ� ��ŭ �����Ѵ�.
		
		
		if(price[idx]>small) { //4>2
			result +=small*distance[idx];//result += 2*1 
			
			
			idx++;
			if(idx!=city-1) {
				
				find(idx);
			}
			else
				return result;
		}
		else {//2<5
			//for(int i=0; i<idx; i++) {
			//	pdistance+=distance[i];
			//	System.out.println("pdistance "+pdistance);
			//}
			//tdistance=tdistance-pdistance;
			//System.out.println("tdistance "+tdistance);
			
			result +=price[idx]*(distance[idx]);//result+=2*3;
			small=price[idx]; //small=2


			
			idx++; //idx=2
			if(idx!=city-1) {
				
				find(idx); //find(2)
			}
			else
				return result;

		}
		
		
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		city = sc.nextInt();
		distance = new int [city-1];
		price = new int [city];
		result=0;
		
		
		for(int i=0; i<city-1; i++) {
			distance[i]=sc.nextInt();
			tdistance+=distance[i];
		}
		
		for(int j=0; j<city; j++) {
			price[j]=sc.nextInt();
			
		}
		int smallest = price[0];
		small = price[0];
		
		for(int j=0; j<city; j++) {
			if (smallest>price[j])
				smallest = price[j];
		}
		
		if(smallest == price[0]) {
			result = price[0]*tdistance;
			System.out.println(result);
		}
		else {
			
			result=price[0]*distance[0]+find(1);
		
			System.out.println(result);
		}
		sc.close();
	}

}
