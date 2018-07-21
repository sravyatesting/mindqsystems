package firstJavaPackage;

public class MethodsExample
{
	public int test(int x,int y)
	{
		int mul=x*y;
		int div=mul/10;
		return div;
	}
	public static void main(String[] args) {
		MethodsExample obj=new MethodsExample();
		int a=obj.test(20, 30);
		System.out.println(a);
	}

	
}



	
		
	

