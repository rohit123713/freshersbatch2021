package example.demo;

class Child extends Parent{

	public Child (){
		System.out.println("B");
		}
	
	public Child (int i){
		super(i);
		System.out.println(i+3);
	}
}
