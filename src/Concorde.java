
public class Concorde extends AvionDeCalatori {

	public Concorde(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);
	}

	public void goSuperSonic() {
		System.out.println("PlaneID_Value - Supersonic mode activated");
	}
	
	public void goSubSonic() {
		System.out.println("PlaneID Value - Supersonic mode deactivated");
	}
}
