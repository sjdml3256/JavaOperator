package cast;
/*
 * @ Date : 2015. 07.07
 * @ Author : me
 * @ Story : 다운캐스팅 문법
 * */
public class DownCasting {
	public static void main(String[] args) {
		/*
		 Down Casting(다운 캐스팅)
		 -강제 형변환
		 -프로그램에서 데이터 타입이 큰 변수(64bit)를 데이터 타입이 작은 변수(32bit)로
		   할당하려 할때명시적(int)으로 타입을 지정하는것
		 -다만, 데이터의 손실이 발행함
		 -개발자는 직접 다운캐스팅을 하려고 하지 말고 이클립스를 통해 자동으로 add cast한다.
		 * */
		int a = 7;
		double b = 3.14D;
		a=(int) b;
		
		System.out.println("다운 캐스팅 결과 : "+a);
		
	}
}
