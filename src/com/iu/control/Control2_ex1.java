package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {
	public static void main(String[] args) {
		//   월급을 입력
		// 1.정규직 2.계약직
		// 정규직 - 국민연금 월급의 1%, 건강보험 월급의 1.4%, 고용보험 월급의 0.5%, 산재보험 월급의 0.7%
		// 계약직 - 월급의 3.3%
		
		Scanner sc = new Scanner(System.in);
		
		int salary = 0;
		int num = 0;
	
		
		System.out.println("월급을 입력하세요");
		salary=sc.nextInt();
		
		System.out.println("1.정규직  / 2.계약직");
		num=sc.nextInt();
		
		if(num==1) {
			System.out.println("정규직");
			
		}else {
			System.out.println("계약직");
			
		}
		
		if(num==1) {
			
			double a = salary*0.01;
			double b = salary*0.014;
			double c = salary*0.005;
			double d = salary*0.007;
			double total1 = salary - (a+b+c+d);
			
			System.out.println("국민연금: "+ a);
			System.out.println("건강보험: "+ b);
			System.out.println("고용보험: "+ c);
			System.out.println("산재보험: "+ d);
		    
			System.out.println("총급여: " + total1);
		}else {
			double e = salary*0.033;
			double total2 = salary - e;
			System.out.println("세금: " + e);
			System.out.println("총급여: " + total2);
		}
		
	}

}
