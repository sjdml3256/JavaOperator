package variable;
/*
 * @ Date : 2015. 07.07
 * @ Author : me
 * @ Story : 값 입력 받아 출력하기
 * */
import java.util.Scanner;

public class IntputTotal {
	public static void main(String[] args) {
		// 선언부 : 초기화 영역
		//int kor =0... - 디폴트값 선언
		//int kor,eng,..- 인스턴스 변수 선언법
		
		// 연산부 : 프로세싱
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = scanner.nextInt();
		//스캐너 쓰기전에 int 변수 를 먼저 선언하면 스캐너의 int는 안쓴다.
		int total = kor + eng + math; // total 지역변수를 연산식으로 초기화 함.
		
		// 결과값 리턴
		System.out.println("총점 :"+total);
	}
}
