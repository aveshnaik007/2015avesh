package elevator;

public class Elevator {
	
	private String state;
	private int currentLifFloor=0;
	ElevatorDoor elvDor = new ElevatorDoor();
	FloorPanel fp = new FloorPanel(5);
	
	public int getCurrentFloor() {
		return currentLifFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentLifFloor = currentFloor;
	}
	
	public int services(int source,int desti){
		if(currentLifFloor < source)
			this.Moveup(source);
		else if(currentLifFloor > source)
			this.MoveDown(source);
		
		int destFloor=fp.Buttons.get(desti).getNumber();
		
		if(currentLifFloor < desti)
			this.Moveup(desti);
		else if(currentLifFloor > desti)
			this.MoveDown(desti);
		
		return destFloor;
	}
	
	public void Moveup(int de){
		System.out.println("Moving UP");
		currentLifFloor=de;
	}
	
	public void MoveDown(int de){
		System.out.println("Moving Down");
		currentLifFloor=de;
	}
	
}
