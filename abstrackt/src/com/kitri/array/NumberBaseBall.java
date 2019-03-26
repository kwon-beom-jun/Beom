package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  0. com, my 3자리 배열.
  1. com 세자리 난수 발생. >> comRandom() 메소드 생성
	a. 1의 숫자는 중복 숫자 x
	b. 0의로 시작 x
  2. 정답 물어보기
  3. 정답 맞췄을때
  4. 다시 문제 낼때
  5. 내가 입력숫자 컴이 입력 숫자 자리 비교. 배열로 비교
  6. com과 my의 숫자와 자리비교
  7. 숫자가 같다면
   5-1. 자리수가 같다면 strike 증가
   5-2. 자리수가 다르면 ball 증가
  6. 5의 결과 
   6-1
  	strike가 3 : 
  	x번째만에 xxx는 정답입니다.  
  	계속(1), 종료(0)
   6-2 strike가 3이 아니라면
   	xxx는 x스트라이크 x볼입니다. >> 3번으로
*/


public class NumberBaseBall {
	
	private int my[] = new int[3];
	private int com[] = new int[3];
	private int my2[] = new int[1];
	BufferedReader in;
	int gCount = 0;
	
	public NumberBaseBall() {
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private void comRandom() {
		
		for( ; ; ) {
			com[0] = (int)(Math.random() * 9) + 1;		
			com[1] = (int)(Math.random() * 9) + 1;		
			com[2] = (int)(Math.random() * 9) + 1;	
			
			if(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]) {				
				
			}else {
				System.out.println(com[0] +""+ com[1] +""+ com[2]);
				break;
			}
	
		}
	}

	private void game() {
		while(true) {
			System.out.println("숫자입력 : ");
			int myNum = getNumber();
			my[0] = myNum/100;	// 1	
			my[1] = myNum/10 - (myNum/100)*10;	// 4	
			my[2] = myNum - (myNum/10)*10;	// 9
			
			int count = 0;
			int ball = 0;
			int len = my.length;
			
			// 숫자와 자리수 비교
			
			if (my[0] == com[0]) {
				count++;
			}else if(my[0]==com[1]){
				ball++;
			}else if (my[0]==com[2]) {
				ball++;
			}
			if (my[1] == com[1]) {
				count++;
			}else if (my[1] == com[0]) {
				ball++;
			}else if (my[1]== com[2]) {
				ball++;
			}
			if (my[2] == com[2]) {
				count++;
			}else if (my[2]==com[1]) {
				ball++;
			}else if (my[2]==com[0]) {
				ball++;
			}
			
			System.out.println(count + "스트라이크\t" + ball + "볼");
			
			gCount++;
			
			while (true) { // 2번씩 치는 이유. // game메소드 실행 안돼는 이유.
								
				if (count == 3) {
					System.out.println(gCount + "번째만에 성공했습니다." + 
							com[0] + com[1] + com[2] +"는 정답입니다.");
					System.out.println("계속(1), 종료(0)");

					my2[0] = getNumber();
					
					if (my2[0] == 1) {
						comRandom();
						gCount = 0;
						break;
						//game();
					}else if(my2[0] == 0){
						count = 0;
						exit();
					}else {
						System.out.println("다른 숫자를 눌러주시기 바랍니다.");
					}
					
				} else {
					System.out.println("계속(1), 종료(0)");

					my2[0] = getNumber();
					
					if (my2[0] == 0) {
						exit();
					}else if(my2[0] == 1){
						count = 0;
						break;
					}else {
						System.out.println("다른 숫자를 눌러주시기 바랍니다.");
					}
				}
			}
		}
	}
	
	
	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	public void exit(){
		System.exit(0);
	}

	
	public static void main(String[] args) {
		NumberBaseBall nbb = new NumberBaseBall();
		nbb.game();
	}

}

















