package oop;

public class TestImpl implements TestInterface {
	@Override
	public int max(int i, int j) {
		int m = i > j ? i : j;
		print("max=" + m);
		return m;
	}

}
