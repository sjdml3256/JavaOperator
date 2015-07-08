package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * 스캐너로 두 값을 입력 받아 사칙연산 결과가
		 * 나오도록 하시오.
		 * 
		 * ex. 20 + 7 = 27...
		 * */
		
		// 선언부
		int x, y,add,sub,mok,gob,nmg;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x 값을 입력 하세요.");
		x = scanner.nextInt(); // next 커서 다음 글자(숫자)를 변수 할당하라.
		System.out.println("y 값을 입력 하세요.");
		y = scanner.nextInt();
		
		add = x+y;
		sub = x-y;
		gob = x*y;
		mok = x/y;
		nmg = x%y;
		
		System.out.println(x+"+"+y+" =\t"+(x+y) );
		System.out.println(x+"-"+y+" =\t"+sub );
		System.out.println(x+"*"+y+" =\t"+gob );
		System.out.println(x+"/"+y+" =\t"+mok );
		System.out.println(x+"%"+y+" =\t"+nmg );
	}
}
