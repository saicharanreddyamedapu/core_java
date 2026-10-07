package threads;

public class Time {
	public static void main(String[] args) {
		
		Thread t1= new Thread(()->{
			int h=23,m=59,s=57;
			for (int i = 1; i <=5; i++) {
				System.out.println(h+":"+m+":"+s);
				s++;
				if(s==60) {
					m++;
					s=0;
					if(m==60) {
						h++;
						m=0;
						if (h==24) {
							h=0;
						}
				}
				
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		t1.start();
	}
}
