package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object args) {
		IOComponent io = IOComponent.getComponent();
		DMComponent dm = (DMComponent) args; 
	
		String list = io.getInput("\nEnter name of the list: "); 
		dm.removeList(list);
		
	}

}
