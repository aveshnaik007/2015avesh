package elevator;

import java.util.ArrayList;

public class FloorPanel {
	
	ArrayList<FPButton> Buttons = new ArrayList<FPButton>();
	
	public FloorPanel(int numFloor) {
		for(int i=0;i<=numFloor;i++){
			FPButton bnum = new FPButton(i);
			Buttons.add(bnum);
		}
	}
	
}
