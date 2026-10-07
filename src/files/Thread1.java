package files;

public class Thread1 extends Thread {
	
	public void run() {
		for (int i = 1; i <=20; i++) {			
			System.out.println(5+" x "+i+" = "+(5*i));
		}
		
	}
}

