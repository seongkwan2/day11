package inheritance;
class A07{
	public void test() {
		System.out.println("부모 test실행");
		
	}
}
class B07 extends A07{
	public void bbb() {
		System.out.println("자식 bbb실행");
		super.test();	//가독성을 높이기위해 super는 부모것
		this.test();	//this는 내것(자식)
	}
	public void test() {//부모와 자식의 메소드이름(test)가 같을때 순서는 자기자신부터 없으면 부모것을 사용
		System.out.println("자식 test 실행");
	}
}
public class MainClass07 {
	public static void main(String[] args) {
		B07 b = new B07();
		b.bbb();
		//b.test();
	}
}