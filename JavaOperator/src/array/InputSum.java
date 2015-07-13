package array;

import java.util.Scanner;

/*
 * @ Date : 2015. 07.13
 * @ Author : me
 * @ Story : int형 배열 입력 예제
 * */
public class InputSum {
	public static void main(String[] args) {
		int sum = 0, avg = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 점수를 입력하세요.");
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		// 입력된 값을 출력
		// 입력된 값을 합산
		// 입력된 값의 평균
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
			sum += arr[i];
		}
		System.out.println("\n  합 : "+sum);
		System.out.println("평균 : "+sum / arr.length);
	}
}
