package com.amitpamecha.marsrover.command;

import com.amitpamecha.marsrover.model.Orientation;
import com.amitpamecha.marsrover.model.Rover;

public class LeftTurnCommand implements RoverCommand{

	private Rover rover;
	
	public LeftTurnCommand(){
	}
	
	public void execute(Rover rover) {
		Orientation orientation = rover.getCoordinates().getOrientation().getOrientationOnLeftTurn() ;
		rover.getCoordinates().setOrientation(orientation);
	}
}
