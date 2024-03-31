
public class Mig extends AvionDeLupta {

	public Mig(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void highSpeedGeometry() {
		System.out.println("PlaneID Value - High speed geometry selected");
	}
	
	public void normalGeometry() {
		System.out.println("PlaneID Value - Normal geometry selected");
	}
}
