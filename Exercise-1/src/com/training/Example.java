package com.training;

public class Example {

	    protected int x, y;
	
		public Example(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		}
		
		public int getX() {
		return x;
		}
		
		public void setX(int x) {
		this.x = x;
		}
		
		public int getY() {
		return y;
		}
		
		public void setY(int y) {
		this.y = y;
		}

		@Override
		public String toString() {
			return "Example [x=" + x + ", y=" + y + "]";
		}
		
		
}
