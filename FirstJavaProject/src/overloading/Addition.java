package overloading;

public class Addition {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	
	public void add(int a,int b,int c, int d)
	{
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		
		Addition a1=new Addition();
		a1.add(10, 20);
		a1.add(20, 30, 40);
		a1.add(100, 150, 200, 500);
	}

}
