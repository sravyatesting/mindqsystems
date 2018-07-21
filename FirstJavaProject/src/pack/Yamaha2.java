package pack;

public class Yamaha2 implements Yamahaa {
	
	public void color()
	{
		System.out.println("Blue");
	}
	
	public void gears()
	{
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		
		Yamaha2 obj=new Yamaha2();
		
		obj.color();
		obj.gears();
	}
	

}
