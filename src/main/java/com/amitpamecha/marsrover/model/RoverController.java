package com.amitpamecha.marsrover.model;

import com.amitpamecha.marsrover.command.RoverCommand;

//invoker
public class RoverController {

	private RoverCommand command;

	public void performAction(Rover rover){
		command.execute(rover);
	}
	
	public RoverCommand getCommand() {
		return command;
	}

	public void setCommand(RoverCommand command) {
		this.command = command;
	}
}
