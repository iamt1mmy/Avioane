
public class TomCat extends AvionDeLupta {

	public TomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void refuel() {
		System.out.println("PlaneID Value - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
	}

}
