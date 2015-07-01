package elevator;

public class Floor {
	 Integer flrNo;
     
	 UpButton up;
     DownButton down;
     FloorDoor fDoor;
     
    public Integer getFlrNo() {
 		return flrNo;
 	}
 	Floor(Integer flrNo) {
 		this.flrNo = flrNo;
 	}
}
