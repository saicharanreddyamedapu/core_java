package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) {
		try (FileReader fr= new FileReader("src\\text\\S1.txt")){
			int data=fr.read();
//			System.out.println((char)data);
//			System.out.println((char)fr.read());
			while (data!=-1) {
				System.out.print((char)data);
				data=fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
