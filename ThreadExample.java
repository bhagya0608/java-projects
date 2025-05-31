package abc;
class car extends Thread{
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
class Bike extends Thread{
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
public class ThreadExample{
	public static void main(String[] args) {
		car c=new car();
		Bike b=new Bike();
		c.start();
		b.start();
	}
}
