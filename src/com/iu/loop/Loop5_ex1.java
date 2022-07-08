package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int yId=1234;
		int yPw=5678;
		
		//ID입력,PW입력
		//로그인 판단      로그인이 성공하면 종료
		//실패하면 다시 입력
		boolean check = true;
		
		boolean flag = true;
		
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종 료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("ID입력");
				int id=sc.nextInt();
				
				System.out.println("PW입력");
				int pw=sc.nextInt();
			
			
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				check=!check;
				
			}else {
				System.out.println("로그인 실패");
				}
			break;
			default:
				check=!check;
			}
		}
	    //-----------------------------------------------------------------------------------
		//로그인을 실패했으면 프로그램이 종료
		//로그인을 성공했으면 게임 시작
		//RPG
		//시작레벨은 1
		//만렙      15
		//gold   : 1000;
		//모든 몬스터의 경험치는 동일
		//1->2 :3
		//2->3 :6
		//3->4 :9
		//4->5 :12
		//5->6 :15
		
		//14->15 :종료
		//5레벨 달성시 축하금으로 1000 gold 지급
		//10레벨 달성시 축하금으로 2000 gold 지급
		//15레벨 달성시 축하금으로 3000 gold 지급
		
		//flag=true;
		if(flag) { //flag true면 로그인성공, false면 로그인 실패
			System.out.println("게임을 시작");
			int level = 1;
			int gold = 1000;
			
			for(level=1;level<15;level++) {
				
				if(level%5==0) {
					gold = gold+level/5*1000;
				}
				
				for(int mon=0;mon<3*level;mon++) {
					System.out.println(mon+1+"꽥!!!");
				}
				System.out.println("=========================");
			}
			
			gold = gold+3000;
			
			System.out.println("최종레벨 : "+level);
			System.out.println("최종Gold : "+gold);
		}
		
		
			System.out.println("프로그램을 종료합니다");
		
	}

}
