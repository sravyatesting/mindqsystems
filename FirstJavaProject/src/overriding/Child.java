package overriding;

public class Child extends Parent {

	public void sub()
	{
		System.out.println(10-5);
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.sub();
		c.add();
		
	}
}
