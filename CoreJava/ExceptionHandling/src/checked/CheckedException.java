package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) /* throws FileNotFoundException */ { // the default exception handler of the
																				// JVM will handle

		CheckedException ce = new CheckedException();
		try {
			ce.readFile(); // if throws used in the called method, then exception need to be handled in the
							// calling method
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	void readFile() throws FileNotFoundException { // need not handle the exception here in the method ( no try catch
													// required )
//		try {
		FileInputStream fis = new FileInputStream(""); // checked exceptions need to be handled
//		} catch (FileNotFoundException e) { // else the program will not compile
////			System.out.println("File could not be found");
//			e.printStackTrace();
//		}
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
