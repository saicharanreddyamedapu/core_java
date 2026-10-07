package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutStream {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try (FileOutputStream fos = new FileOutputStream("src\\text\\S1.txt", true)){
			System.out.println("Enter the data");
			String data=sc.nextLine();
			fos.write(data.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
