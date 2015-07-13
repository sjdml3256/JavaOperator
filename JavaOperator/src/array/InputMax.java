package array;

import java.util.Scanner;

/*
 * @ Date : 2015. 07.13
 * @ Author : me
 * @ Story : int형 배열 에서 입력값중 최대값 구하기
 * */
public class InputMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요.");
		
		// 배열 선언 및 초기화
		// for-loop으로 입력받기
		// 비교 로직은 if문 사용
		int max=0;
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("최대값은 : "+max);
		
	}
}
