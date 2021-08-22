package exercise.a.a;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		
		/*
		 * 여러분은 생명을 창조 할 수 있습니다.
		 * 이번 목표는 앵무새를 만드는 것입니다.
		 * 만드려는 앵무새는 다른 앵무새들처럼 여러분의 말을 그대로 따라 할 뿐 만아니라
		 * 여러분이 선정한 금지어(1 단어만 선택)를 기억하고 모자이크(xx)처리 하며 따라 할 수 있어야합니다.(콘솔창 출력)  
		 * 예)
		 * 입력 : Hi, babo??
		 * 출력 : Hi, xxxx??
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("말을 하시오 : ");
		String str = sc.nextLine();
		System.out.println(str.replace("babo","xxxx"));
		
		/*1970년 1월 1일 00시 00분 2021년 8월 22일 00시 00분 까지 의 일수를 구하세요.
		 * 
		 * */
		
		Calendar day = new GregorianCalendar(1970,0,1,0,0,0);
		Calendar date = new GregorianCalendar(2021,7,22,0,0,0);
		long cal1 = date.getTimeInMillis();
		long cal2 = day.getTimeInMillis();
		long cal3 = cal1 - cal2;
		long bday = ((((cal3/1000)/60)/60)/24);
		System.out.println(bday +  "일");
		
		
		
	}
}
