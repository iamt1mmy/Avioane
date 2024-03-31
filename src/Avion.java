
public class Avion {

	private String planeID;
	private int totalEnginePower;
	
	public Avion(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}
	
	public String getPlaneID() {
		return this.getPlaneID();
	}
		
	public int getTotalEnginePower() {
		return this.getTotalEnginePower();
	}
	
	public void takeOff() {
		System.out.println("PlaneID Value - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
	}
	
	public void land() {
		System.out.println("PlaneID Value - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
	}
	
	public void fly() {
		System.out.println("PlaneID Value - Flying");
	}
}
