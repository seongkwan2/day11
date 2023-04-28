package inheritance;

import java.util.ArrayList;

//상속을 안받고 사용하면 이렇게 하나하나 해야함
class A03{
	private ArrayList<String> arr;
	public A03() { arr = new ArrayList<>();}
	
	public ArrayList<String> getArr(){
		return arr;
	}
	
}
public class MainClass03 {
	public static void main(String[] args) {
		A03 a = new A03();
		ArrayList<String> arr = a.getArr();
		arr.add("1111");
		System.out.println(arr.get(0));
		//a.arr.add("1111");
		//System.out.println(a.arr.get(0));
	}
}
