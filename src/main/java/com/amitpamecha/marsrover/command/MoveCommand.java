package com.amitpamecha.marsrover.command;

import com.amitpamecha.marsrover.model.Orientation;
import com.amitpamecha.marsrover.model.Rover;

public class MoveCommand implements RoverCommand{

	private Rover rover;
	
	public MoveCommand(){
	}
	
	public void execute(Rover rover) {
		Orientation orientation = rover.getCoordinates().getOrientation();
		int xCoordinate = rover.getCoordinates().getxCoordinate();
		int yCoordinate = rover.getCoordinates().getyCoordinate();
		
		if(orientation.equals(Orientation.N)){
			yCoordinate=++yCoordinate;
		}else if(orientation.equals(Orientation.E)){
			xCoordinate=++xCoordinate;
		}else if(orientation.equals(Orientation.W)){
			xCoordinate=--xCoordinate;
		}
		else if(orientation.equals(Orientation.S)){
			yCoordinate=--yCoordinate;
		}
		boolean result = rover.checkIfCoordinatesWithinBound(xCoordinate, yCoordinate);
		if(result){
		rover.getCoordinates().setxCoordinate(xCoordinate);
		rover.getCoordinates().setyCoordinate(yCoordinate);
		}else{
			System.out.println("New coordinated are outside terrain. Please enter new coordinates");
		}
	}

}
