package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외는 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수: ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		int avg = (int)(sum/3.0);
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ avg);
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
