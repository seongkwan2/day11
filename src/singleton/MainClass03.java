package singleton;
class A03{
	private static A03 a;
	int num;
	private A03(){	//private로 되어있어서 직접적인 접근 불가능
		System.out.println("생성자 실행");
	}
	public static A03 getInstance(){//public static으로 최초실행 getInstance()라는 메소드를 이용해서
									//if문으로 a가 값이 비었을 경우 한번만 new로 객체생성
		System.out.println(a);		//생성된 객체 a를 반환함
		if(a==null)	//a에 값이 없을때 최초 한번만 new 생성
			a = new A03();
		return a;
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		A03 a01 = A03.getInstance();
		A03 a02 = A03.getInstance();
		A03 a03 = A03.getInstance();
		a01.num = 100; a02.num =200; a03.num=300;
		System.out.println("=======================");
		System.out.println("01 : "+a01.num+" : "+a01);
		System.out.println("01 : "+a02.num+" : "+a02);
		System.out.println("01 : "+a03.num+" : "+a03);
		
	}
}
