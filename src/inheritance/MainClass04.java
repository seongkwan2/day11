package inheritance;
//상속의 동작순서 1.부모 2.자식
class A04{
	public A04() {
		System.out.println("부모 클래스");
	}
	
}
class B04 extends A04{
	public B04() {
		System.out.println("자식 클래스");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
	}
}
