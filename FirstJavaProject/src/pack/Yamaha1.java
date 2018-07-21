package pack;

public class Yamaha1 extends Yamaha {
	
	public void color()
	{
		System.out.println("Black");
	}
	
	public static void main(String[] args) {
		
		Yamaha1 obj=new Yamaha1();
		obj.color();
		obj.tyres();
	}

}
