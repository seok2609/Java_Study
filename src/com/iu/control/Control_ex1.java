package com.iu.control;

import java.util.Scanner;

public class Control_ex1 {

	public static void main(String[] args) {
		
		// 1. 키보드로부터, 국어, 영어, 수학 점수를 차례로 입력
		//    총점과 평균을 계산
		//	  평균이 90점 이상이면 우등상 수상
		// 	  모든 학생들은 졸업
		
		// 2. 평균이 90점 이상이면 A학점 출력
		//    평균이 80점 이상이면 B학점 출력
		// 	  평균이 70점 이상이면 C학점 출력
		//    평균이 60점 이상이면 D학점 출력
		//    그외 나머지는 F학점 출력
		
		Scanner sc = new Scanner(System.in);
		
		//1.
		
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		
		double avg = sum/3.0;
		System.out.println("평균 : " + avg);
	
		if(avg>=90) {
			System.out.println("우등상 수상");
		}
		
		// 2.
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		if(avg>=80 && avg<90) {
			System.out.println("B학점");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C학점");
		}
		if(avg>=60 && avg<70) {
			System.out.println("D학점");
		}
		if(avg <60) {
			System.out.println("F학점");
		}
		
		System.out.println("졸업");

	}

}
