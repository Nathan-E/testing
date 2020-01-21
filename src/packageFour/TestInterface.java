package packageFour;

public interface TestInterface {
	void printOut(int x);
	
	default int divide(int x, int y) {
		return x/y;
	}
}
