package files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw=new FileWriter("src\\text\\S2.txt",true))
		{
			System.out.println("Enter the data to store..");
			String data=sc.nextLine();
			fw.write(data);
//			fw.flush();
//			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
