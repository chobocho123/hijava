package oop;

public abstract class SoftWare {
	
	public abstract void plan();
	public abstract void develope();
	public abstract void release();
	
	public final void start() {
		plan();
		develope();
		release();
	}

}
