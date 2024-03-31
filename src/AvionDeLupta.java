
public class AvionDeLupta extends Avion {

	public AvionDeLupta(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void launchMissile() {
		System.out.println("PlaneID Value - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
	}

}
