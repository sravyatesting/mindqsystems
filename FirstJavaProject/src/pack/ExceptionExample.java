package pack;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
			
			System.out.println(a/b);
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			
			System.out.println("error");
			
			
		}
	}

}
