package pack;

import java.io.File;
import java.io.FileInputStream;

public class CompileTimeException {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\HOME\\Desktop\\icet.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
