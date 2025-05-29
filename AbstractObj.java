package sample;

abstract class Bike{
	void start() {
		System.out.println("Bike was started");
	}
	abstract void drive();
	abstract void stop();
}


public class AbstractObj {
	public static void main(String agrs[]) {
		Bike obj = new Bike() {
			void drive() {
				System.out.println("Bike Driving ...");				
			}
			void stop() {
				System.out.println("Bike Stoped...");
			}
			
		};
		
		obj.start();
		obj.drive();
		obj.stop();
	}

}
