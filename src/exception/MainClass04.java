package exception;
class A04{}
class B04 extends A04{}
class C04 extends A04{}

public class MainClass04 {
	public static void main(String[] args) {
		C04 c = new C04();
		A04 a;
		a = new C04();
		a = new B04();
		
		int num = 2;
		int[] arr = new int[3];
		arr[0]=1; arr[1]=2; arr[2]=3;
		
		try {
			System.out.println(10/2);
			for(int i=0; i<10; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {		//이렇게 한번에 Exception e로 통합해서 사용할수있고
			e.printStackTrace();	//어떤 문제가 발생했는지 알려준다.
		}
		System.out.println("다음 문장들 실행");
	}
}
