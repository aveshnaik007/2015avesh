package elevator;

import java.util.ArrayList;
import java.util.List;

public class Building {
    Elevator elev;
    
    List<Floor> floors=new ArrayList<Floor>();
    
    Building(Integer numFloors){
    	for(int i=0;i<numFloors;i++){
    		floors.add(new Floor(i));
    	}
    }
    
    public int services(int src,int dest){
    	if(dest > src)
    		floors.get(src).up.press();
    	else if(src > dest)
    		floors.get(src).down.press();
    	return elev.services(src,dest);
    }
}
