package threads;
public class SleepExample {
	public static void main(String[] args)  {
		Thread t1=new Thread(()->{
			for (int i = 1; i < 6; i++) {
				System.out.println(i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
	}
}
