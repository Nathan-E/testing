package packageFour;

public abstract class Test  implements TestInterface{
	
	abstract int sum(int x, int y);
	
	public int subtract(int x, int y) {
		return x - y;
	};
	
	public int divide(int x, int y) {
		return x*y;
	}

}
