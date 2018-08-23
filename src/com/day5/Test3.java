package com.day5;

import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		
		//1~45까지의난수를 발생시켜 6개의 수를 크기순으로 정렬
		
		Random rd = new Random();
		
		int[] num = new int[6]; //일반변수 > 쓰레기값 
								//배열 변수 int> 0. String = null int = 0 (기본값으로 자동으로초기화)
		
		int i, j ,n, temp;
		
		n = 0;
		while(n<6){           //[]가 0,1,2,3,4,5 = 6개만들어지기때문에
			
			num[n] = rd.nextInt(45)+1;   //original = num[n] = rd.nextInt(); 
			//but int 가 -21억 < int < 21억
			//so  rd.nextInt(45)적으면
			//0<=n<=44 가 된다
			//그래서 rd.nextInt(45)+1 을시킨다.
			
//-----------------------------------------------------------------------------------------------------------	
			//같은 숫자가 안나오게 만드는 코딩
				for(i=0;i<n;i++){
					if(num[i]==num[n]){
						n--;
						break;
					}
				}
//-----------------------------------------------------------------------------------------------------------	
			n++;       
		}
//-----------------------------------------------------------------------------------------------------------			
		//정렬
		for (i = 0; i < num.length; i++) { // 칸수보다 -1 적게 계산

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) { // num[i] < num[j] 내림차순이 됨
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;		
				}
			}
		}	
//-----------------------------------------------------------------------------------------------------------			
		//출력
		for(int su : num){
			System.out.printf("%4d", su);
			
		}
		System.out.println();
		
		
		
		

	}

}
