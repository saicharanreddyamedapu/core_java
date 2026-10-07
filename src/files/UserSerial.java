package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerial {
	public static void main(String[] args) {
		try(ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("src\\text\\User1.txt"))){
			User u1 = new User("Rohith", 40, "Rohith@12");
			ob.writeObject(u1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
