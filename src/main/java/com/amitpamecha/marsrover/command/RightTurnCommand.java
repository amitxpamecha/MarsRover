package com.amitpamecha.marsrover.command;

import com.amitpamecha.marsrover.model.Orientation;
import com.amitpamecha.marsrover.model.Rover;

public class RightTurnCommand implements RoverCommand{

	private Rover rover;
	
	public RightTurnCommand(){
	}
	
	public void execute(Rover rover) {
		Orientation orientation = rover.getCoordinates().getOrientation().getOrientationOnRightTurn() ;
		rover.getCoordinates().setOrientation(orientation);
	}
}
