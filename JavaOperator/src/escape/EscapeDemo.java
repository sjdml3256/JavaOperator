package escape;

import java.util.Scanner;

public class EscapeDemo {
	public static void main(String[] args) {
		/*
		 문제. 홍길동씨는 30세 김유신씨는 25세
		 홍길동씨와 김유신씨의 나이차이를 출력하는데
		 "홍길동씨는 김유신씨보다 5세가 많습니다."
		 * */
		//지역변수 선언부
		int hongAge = 0, kimAge = 0, age =0; // 나이 디폴트
		String hong = "", kim = ""; // 리터럴 디폴트 값
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름?");
		hong = scanner.next();
		System.out.println("이름?");
		kim = scanner.next();
		
		System.out.println("홍길동나이?");
		hongAge = scanner.nextInt();
		System.out.println("김유신나이?");
		kimAge = scanner.nextInt();
		
		age = hongAge - kimAge;
		
		System.out.println(hong+"씨는\t"+ kim+"씨 보다 "+age+"세가 많습니다.");
		/*
		 escape 문자 (\t, \n) 처럼 알파벳에 \를 첨부하여 특수한 기능을 나타내도록 한 문법
		 * */
	}
}
