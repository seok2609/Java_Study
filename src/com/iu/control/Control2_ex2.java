package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("1-5사이의 숫자 입력");
		int num = sc.nextInt(); //1-5
		System.out.println("알파벳을 입력");
		
		char ch = sc.next().charAt(0);
		
		int result = ch+num;
		
		//소문자가 범위를 벗어났을 때
		
		
		/*if(result>'z') {
			result = result - 'z' -1; //2
			result = 'a' + result;
		}*/
		
		if(result>122) {
			result = result - 122;
			result = 96 + result;
		}
		
		//대문자가 범위를 벗어났을 때
		
		/*if(result>'Z' && result<'a') {
			result = result-'Z' -1;
			result = 'A' + result;
		}*/
		
		if(result>90 && result<97) {
			System.out.println("대문자 영역");
			result = result - 90;
			result = 64 + result;
		}
		
		ch = (char)result;
		
		System.out.println("ch: " +ch);
		//num : 2 ch :2

		
		
		// num:1 ch:a 출력 -> b
		// num:2 ch:b 출력 -> c
		// num:1 ch:z 출력 -> a
		// num:2 ch:z 출력 -> b
	

		//study
		//home edition		
		
		
		
	}

}
