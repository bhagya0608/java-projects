package abc;
 class car implements Runnable{
	public void run() {
		for(int i = 1; i <=3; i++) {
			System.out.println("car runs");
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
				
			}
		}
	}
class bike implements Runnable{
	public void run() {
		for(int i = 1; i <=3; i++) {
			System.out.println("Bike runs");
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
				
			}
	}
}
public class ImplementExample{
	public static void main(String[] args) {
		Thread t=new Thread(new car());
		Thread b=new Thread(new bike());
	t.start();
	b.start();
	}
}


