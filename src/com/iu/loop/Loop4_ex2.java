package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {
	public static void main(String[] args) {
		//FPS
		//총알 :
		//탄창 :30발, 3개
		//1.단발 2.점사
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
//		String sou ="탕";
		
		
		for(int mag=0;mag<3;mag++) {
		
		System.out.println("1.단발 , 2.점사");
		//num = sc.nextInt();
		int select = sc.nextInt();
		
		int inc = 3;
		String sound ="타타탕";
		
		if(select ==1 ) {
			inc = 1;
			sound = "탕";
		}
		
		for(int b=0;b<30;b=b+inc) {
			System.out.println(sound);
		}
		
		
		
//--------------------------------------------------------------		
//		int count =10;
//		if(select==1) {
//			count = 30;
//			sound="탕";
//		}
//		for(int b=0;b<count;b++) {
//			System.out.println(sound);
//		}
		
		
		
// ---------------------------------------------------------------		
//		if(select==1) {
//			for(int j=0; j<30; j++)
//				System.out.println("탄창: " + mag + "총알: " + j + "탕");
//				}
//		}else {
//			for(int b=0;b<10;b++) {
//				System.out.println("탄창: "+ mag + "총알: "+ b + "타타탕");
//		}
		
		
//		switch(num) {
//		case 1:
//			for(int i=0; i<3; i++) {
//				for(int j=0; j<30; j++)
//				System.out.println("탄창: " + i + "총알: " + j + sou);
//				}
//			break;
//		case 2:
//			for(int i=0; i<3; i++) {
//				for(int j=0; j<10; j++) {
//					System.out.println("탄창: " + i + "총알: " + jom);
//				}
//			break;
//			}
//			
//		}
				
	   }
	}
}
