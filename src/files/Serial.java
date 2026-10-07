package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) {
		try(ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("src\\text\\Car.txt"))){
			Car c1 = new Car("Porsche", "blue", 3000);
			ob.writeObject(c1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
