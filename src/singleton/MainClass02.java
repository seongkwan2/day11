package singleton;
class A02{
	int num;
	public A02() {
		System.out.println("생성자 실행");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		A02 a01 = new A02();	//new = 생성자를 호출하는 코드 (객체생성)
		A02 a02 = a01;
		A02 a03 = a02;	//주소만 저장하는 이행위를 '얕은복사' 라고한다.
		
		a01.num = 100; a02.num =200; a03.num=300;
		System.out.println("01 : "+a01.num+" : "+a01);
		System.out.println("01 : "+a02.num+" : "+a02);
		System.out.println("01 : "+a03.num+" : "+a03);
	}
}
