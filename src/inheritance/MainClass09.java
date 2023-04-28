package inheritance;
/*
 protected : 외부의 접근은 불가능 하고 자식에게는 허용한다.
 private < default(없는것) < protected < public
 */
class A09{
	protected int num = 100;
	String s = "부모";
}
class B09 extends A09{
	String s = "자식";
	public void test() {
		System.out.println(num);
		System.out.println(super.s); //같은 변수가 있을때 super를 사용하면 부모것
		System.out.println(this.s);	 //this를 사용하면 자식것 사용
	}
}
public class MainClass09 {
	public static void main(String[] args) {
		B09 b = new B09();
		b.test();
	}
}
