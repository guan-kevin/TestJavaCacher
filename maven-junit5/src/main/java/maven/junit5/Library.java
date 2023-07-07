package maven.junit5;

public class Library {
	public int intAddition(int left, int right) {
		return left + right;
	}
	
	public double doubleAddition(double left, double right) {
		return left + right + 1;
	}
	
	public double division(double left, double right) {
		return left / right;
	}
	
	public int getFromArray(int index) {
		int[] myArray = new int[10];
		for (int i = 0; i < 10; i++) {
			myArray[i] = i;
		}
		return myArray[index];
	}
}
