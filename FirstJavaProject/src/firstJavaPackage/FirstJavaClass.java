package firstJavaPackage;

public class FirstJavaClass {
	
	int a;
	String str;
	
	public FirstJavaClass(int a,String str) {
		
		this.a=a;
		this.str=str;
	}
	public static void main(String[] args) {
		FirstJavaClass obj=new FirstJavaClass(100,"Automation");
		
		System.out.println(obj.a);
		System.out.println(obj.str);
		
		FirstJavaClass obj1=new FirstJavaClass(200,"Manual");
		
		System.out.println(obj1.a);
		System.out.println(obj1.str);
	}	
	
	

}
