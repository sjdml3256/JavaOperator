package Loop;
/*
 * @ Date : 2015. 07.10
 * @ Author : me
 * @ Story : for-loop 을 활용한 1부터 10까지의 합
 * */
public class ForLoopSum {
	public static void main(String[] args) {
		int sum = 0; // 누적되는 결과 값을 출력 하는 변수는
					// for-loop 바깥쪽에 선언 및 초기화 한다.
		for (int i = 0; i <= 10; i++) {
			sum += i; // sum = sum + i; 와 같다.
		}
		System.out.println("1 부터 10까지의 합 : "+sum);
	}

}
