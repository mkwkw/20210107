//백준 13305
//그리디

//예시
//4
//2 3 1
//5 2 4 1

//	2   3   1
//5	  2   4   1

//일단 price[idx]*distance[idx]
//price[idx-1]이 price[idx]보다 작다면 price[idx]대신에 price[idx-1]
//비교
//왜 틀렸을까?
import java.util.*;

public class p1 {
	
	private static int city; //도시의 개수
	private static int distance[]; //도시 사이의 거리
	private static int tdistance; //거리 총합
	private static int pdistance;
	private static int price[]; //주유소 가격
	private static int result; //결과: 최소 비용
	private static int small; //싼 가격
	
	
	
	private static int find(int idx) {
		//첫번째 주유소의 가격이 최소값이 아니라면 다음 주유소 갈만큼만 주유한다.
		//result += price[0]*distance[0];
		//첫번째 주유소의 가격이 가장 작으면 총 거리만큼 주유한다.
		//result += price[0]*(전체거리);
		
		
		//두번째 이상 주유소의 가격이 이전 가격보다 작으면 총 거리-이전거리 만큼 주유한다.
		
		
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
