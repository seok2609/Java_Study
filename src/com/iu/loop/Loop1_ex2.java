package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 1번 대문자, 2번 대문자
		// 1번이면 A - Z 출력
		// 2번이면 a - z 출력

		System.out.println("1번 대문자, 2번 대문자");
		int num = sc.nextInt();

		if (num == 1) {
			for (char i = 'A'; i <= 'Z'; i++) {
				System.out.println(i);
			}

		} else {
			for (char t = 'a'; t <= 'z'; t++)
				System.out.println(t);
		}

		System.out.println("===============");

		// 2. 1 - 10까지의 합 구하기 for문

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합:" + sum);

		System.out.println("================");

		// 3. ID, PW입력해서 로그인 판단
		// 최대 5번까지 시도 가능
		// 로그인 성공하면 그 즉시 종료

		int yId = 1234; // 회원가입시 입력한 ID
		int yPw = 5678; // 회원가입시 입력한 PW
		boolean check = false;
		
		int a = 0;
		for(a=0;a<5;a++) {

			System.out.println("ID: "); 
			int id = sc.nextInt();
			 
			System.out.println("PW: "); 
			int pw = sc.nextInt();
		     
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				check=!check;
				a = 1000;                            //for문 시작 조건문이 a<5이므로 5보다 큰 수를 입력하면 로그인성공시 종료
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}//for끝
		
//		if(a==5) {
//			System.out.println("은행 방문");
//		}else {
//			System.out.println("게임 시작");
//		}
		
		if(check) {
			System.out.println("게임 시작");
			
		}else {
			System.out.println("은행 방문");
		}
		
		System.out.println("Finish");
		

	
		
		 
		 
		/* if(id==1234) { // System.out.println("아이디가 일치합니다."); }else {
		 System.out.println("아이디가 일치하지 않습니다."); 
		 }else if(pw==5678){
		 System.out.println("로그인성공"); 
		 }else {
			 System.out.println("오류입니다.");
		}
		 
		 
		 
		  
		 if(pw==5678) { 
			 System.out.println("종료"); 
			 }else {System.out.println("비밀번호가 일치하지 않습니다");
	}
		
		  for(int i=0;i<=5;i++) {
		  
		  }*/
		 
	}

}
