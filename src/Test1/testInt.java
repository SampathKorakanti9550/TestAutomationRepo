package Test1;

public interface testInt {
	public static void run() {
		System.out.println("run interface");
	}
	void sum(int a, int b);
	public static void main(String[] args) {
		testInt.run();
	}
}
