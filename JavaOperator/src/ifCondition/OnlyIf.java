package ifCondition;

public class OnlyIf {
	public static void main(String[] args) {
		int x = 1, y = 2;
		if ((x==1) && (y==1)) { // and 연산자
			System.out.println("x 는 1 이면서, y도 1 이다.");
		}
		if ((x==1) || (y==1)) { // | 컬럼 or 연산자
			System.out.println("x는 1 이거나, y는 1 이다.");
		}
	}
}
