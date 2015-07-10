package Condition;
/*
 * @ Date : 2015. 07.10
 * @ Author : me
 * @ Story : if-else 예제(큰 수 구하기)
 * */
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 * 학생 3명의 점수(0 점부터 100점 사이)를 입력받아서 1등 출력
		 * 결과.
		 * 1등은 98점입니다
		 * a 와 b를 비교, b 와 c를 비교 a 와 c를 비교
		 * */
		int s1 = 0,s2 = 0, s3 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 점수를 입력하세요");
		s1 = scanner.nextInt();
		s2 = scanner.nextInt();
		s3 = scanner.nextInt();
		if ((s1>=0 && s1<=100)&&(s2>=0 && s2<=100)&&(s3>=0 && s3<=100)) {
			if (s1>s2) {
				s1 = s1;
			}else{
				s1 = s2;
			}if (s1>s3) {
				s1 = s1;
			}else {
				s1 = s3;
			}
			System.out.println("1등은 "+s1+"점 입니다.");
		}else{
		System.out.println("다시 입력해 주십시오.");
		}
	}
}
