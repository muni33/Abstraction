package sample;

abstract class Plane{
	void Start() {
		System.out.println("Ready to fly...");
	}
	
	abstract void fly();
	abstract void Stop();
	
	void Land() {
		System.out.println("Plane Landed...");
	}
	
}

	class IndianPlane extends Plane{
		@Override
		void fly() {
			System.out.println("IndianPlane flying ...");	
		}
		@Override
		void Stop() {
			System.out.println("IndianPlane Stoped...");
		}
		
	}

public class Abstractexp1 {
	public static void main(String args[]) {
		IndianPlane IP = new IndianPlane();
		IP.Start();
		IP.fly();
		IP.Stop();
		IP.Land();
		
	}

}
