package sample;
class A{
	void m() {
		System.out.println("M");
	}
	
	void n() {
		System.out.println("N");
	}
}
public class Deprecated {

	public static void main(String[] args) {
		A a = new A();
		a.n();

	}

}
