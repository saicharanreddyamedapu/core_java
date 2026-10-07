package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserDeSerial {
	public static void main(String[] args) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\text\\User1.txt"))){
			User u=(User)ois.readObject();
			System.out.println(u);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
