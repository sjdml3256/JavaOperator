package Loop;

import java.util.Scanner;

/*
 * @ Date : 2015. 07.13
 * @ Author : me
 * @ Story : for-loop + if 결합 예제
 * */
public class EvenOddSum {
	public void forcalc() {
		/*
		 * 입력 받은
		 * 1 부터 10까지의 수 중에서 각각
		 * 짝수 합과 홀수 합을 분리해서 출력
		 * */
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0,evenSum = 0, oddSum = 0;
		System.out.println("범위 a 와 b를 입력하세요.");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		for (int i = a; i <= b; i++) {
			if(i%2 == 0){
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		
		System.out.println(a+" 부터 "+ b +" 까지의 정수 중에서\n"
				+ "짝수의 합은 "+ evenSum +" 이고\n"
				+ "홀수 합은 "+ oddSum +" 이다.");
	}
}
