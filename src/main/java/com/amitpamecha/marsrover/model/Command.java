package com.amitpamecha.marsrover.model;

import com.amitpamecha.marsrover.command.LeftTurnCommand;
import com.amitpamecha.marsrover.command.MoveCommand;
import com.amitpamecha.marsrover.command.RightTurnCommand;
import com.amitpamecha.marsrover.command.RoverCommand;

public enum Command {

	L("L") {

		@Override
		public RoverCommand getCommand() {
			return new LeftTurnCommand();
		}
		
	}, R("R") {

		@Override
		public RoverCommand getCommand() {
			return new RightTurnCommand();
		}
		
	}, M("M") {

		@Override
		public RoverCommand getCommand() {
			return new MoveCommand();
		}
		
	};

	private String command;

	Command(String command) {
		this.command = command;
	}

	public static Command fromValue(String str) {

		for (Command element : Command.values()) {
			if (element.toString().equals(str)) {
				return element;
			}
		}
		return null;
	}
	
	public abstract RoverCommand getCommand();
	

}
