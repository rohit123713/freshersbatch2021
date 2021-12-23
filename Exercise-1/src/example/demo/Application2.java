package example.demo;

import com.training.Example2;

public class Application2 {

	public static void main(String[] args) {
		
		String values[] = { "1", "2" };
		Example2 example = new Example2(values);
		
		if (example.getArgs().length > 0) {
		System.out.println("Hello World");
		}

	}

}
