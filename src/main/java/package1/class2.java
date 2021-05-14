package package1;

public class class2 {
	protected void finalize() {
		System.out.println("s");
	}
	public static void main(String[] args) {
		class1 c=new class1();
	int c1=50/0;
		System.out.println("checked2 in");
		System.gc();
	}
}
