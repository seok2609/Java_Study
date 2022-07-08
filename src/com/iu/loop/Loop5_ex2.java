package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
//		nexInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아줌
//		int num = random.nextInt(10);     // (); 괄호안 숫자가없으면 모든정수중 하나, 숫자를 입력하면 그 수 미만의 정수 출력
//		System.out.println(num);
		
		//0 : 가위        0<2  0>1 0=0
		//1 : 주먹
		//2 : 보
		
		//사용자가 하나를 입력하고 
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행
		
		boolean check = true;
			
//		while(check) {
//			
//			System.out.println("가위바위보 시작");
//			System.out.print("나 : ");
//			int select = sc.nextInt();
//			System.out.print("컴퓨터 : ");
//			int num = random.nextInt(3);
//			System.out.println(num);
//			
//			if(select==0 && num==0){
//				System.out.println("무승부");				
//			}else if(select==0 && num==1) {
//				System.out.println("패배");
//			}else if(select==0 && num==2){
//				System.out.println("승리");
//				break;
//			}else if(select==1 && num==0) {
//				System.out.println("승리");
//				break;
//			}else if(select==1 && num==1) {
//				System.out.println("무승부");
//			}else if(select==1 && num==2) {
//				System.out.println("패배");
//			}else if(select==2 && num==0) {
//				System.out.println("패배");
//			}else if(select==2 && num==1) {
//				System.out.println("승리");
//				break;
//			}else {
//				System.out.println("무승부");
//			}
//			
//		}
		
		while(check) {
			System.out.println("0.가위 1.주먹 2.보");
			int you = sc.nextInt();
			int com = random.nextInt(3);
			System.out.println("You: "+ you+"  Com :"+com);
			
			
			if(com==0 && you==2) {
				you=-1;
			}
			if(com==2 && you==0) {
				com=-1;
			}
						
			if(com<you) {
				System.out.println("You Win!!");
				break;
			}else if(com==you) {
				System.out.println("Even!");
			}else {
				System.out.println("Com Win!!");
			}
		}
		
	}

}
