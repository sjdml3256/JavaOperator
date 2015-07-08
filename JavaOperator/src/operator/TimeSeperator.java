package operator;

import java.util.Scanner;

public class TimeSeperator {
	public static void main(String[] args) {
		/*
		 * 입력 받은 초를 시간 분 초로 환산하는 프로그램
		 * */
		
		int input = 0, sec = 0, min = 0, hour = 0,moks = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("구하고자 하는 초 를 입력 :");
		input = scanner.nextInt();
		// 입력 받은 초가 500 이라 한다면 500초를 60으로 나눈 나머지가 초
		// 윗 연산에서 나온 몫을 다시 60으로 나눈 나머지가 분
		// 윗 연산에서 나온 몫이 시간
		sec = input%60;
		min = (input/60)%60;
		hour = moks/60;
		
		System.out.println("입력하신\t"+input+" 초 는\n"+hour+" 시간\t"+min+" 분\t"+sec+" 초 입니다.");
	}
}
