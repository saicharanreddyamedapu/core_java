package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
	public static void main(String[] args) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\text\\Car.txt"))){
			Car c=(Car)ois.readObject();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
