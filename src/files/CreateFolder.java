package files;

import java.io.File;
import java.io.IOException;

public class CreateFolder {
	public static void main(String[] args) {
		File f1=new File("src\\text\\S1.txt");
		try {
			if(f1.createNewFile()) {
				System.out.println("Created successfully...");
			}
			else {
				System.out.println("Folder already exists...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		f1.delete();
	}
}
