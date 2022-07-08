package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {
	public static void main(String[] args) {
		
		//분과 초를 입력 받음
		//ex)1, 15
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int min = sc.nextInt();
		
		System.out.println("초 입력");
		int sec = sc.nextInt();		
		
		boolean flag = false;
		
		
		for(int m=0;m<60;m++) {
			
			for(int s=0;s<60;s++) {
				
				System.out.println(m + "분 : " + s + "초");
				if(min==m && sec==s) {
					flag =! flag;
					m=60;
					break;
					
				
				}		
			}
//			if(flag) {
//				break;
//			}
		}
	}

}
