package com.amitpamecha.marsrover.model;

import java.util.Scanner;

import com.amitpamecha.marsrover.model.Orientation;

public class EarthControlRoom {

	public static void main(String[] args){
		Scanner scanner=null;
		try{
		scanner = new Scanner(System.in);
		System.out.println("Please enter length of plateau:");
		int terrainLength = scanner.nextInt();
		
		System.out.println("Please enter breadth of plateau:");
		int terrainBreadth = scanner.nextInt();
		
		System.out.println("Please enter rover length:");
		int roverLength = scanner.nextInt();
		
		System.out.println("Please enter rover breath:");
		int roverbreadth = scanner.nextInt();
		
		LinearTerrain terrain = new RectangularPlateau(terrainLength, terrainBreadth);
		int[][] grid = terrain.initializeGrid(terrainLength, terrainBreadth, roverLength, roverbreadth);
		
		//land Rover
		System.out.println("Please enter rover coorinates (comman separated)");
		
		String[] details = scanner.next().split(",");
		Coordinates coordinates = new Coordinates(Integer.parseInt(details[0]), Integer.parseInt(details[1]), Orientation.fromValue(details[2]));
		
		Rover rover = new Rover();
		rover.landRover(coordinates, terrain);
		
		rover.sendRoverLocation();
		
		System.out.println("Congratulations, Rover landed successfully!");
		
		System.out.println();
		
		System.out.println("Please send commands (comma separated):");
		boolean acceptCommand=true;
		while(acceptCommand){
		String[] commands = scanner.next().split(",");
		RoverController controller = new RoverController();
		for(String command : commands){
			if(command.equalsIgnoreCase("exit")){
				acceptCommand=false;
				break;
			}
			controller.setCommand(Command.fromValue(command).getCommand());
			controller.performAction(rover);
		}
		
		System.out.println("Command executed succesfully, rover new location is as follows:");
		System.out.println("X:"+rover.getCoordinates().getxCoordinate()+", Y:"+rover.getCoordinates().getyCoordinate()
				+", Orientation:"+rover.getCoordinates().getOrientation().toString());
		
		rover.sendRoverLocation();
		}
		}finally{
			scanner.close();
		}
	}
	
	
}
