package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {
	public static void main(String[] args) {
		
		//분과 초를 입력 받음
		//ex)1, 15
		
		Scanner sc = new Scanner(System.in);
	
		
		
		
		
		for(int m=0;m<60;m++) {
			
			for(int s=0;s<60;s++) {
				
				System.out.println(m + "분 : " + s + "초");
				if(m==1 && s==15) {
					System.out.println("종료");
					
				}else {
					
				}
				
			}
			
		}
	}

}
