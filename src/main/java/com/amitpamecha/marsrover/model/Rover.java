package com.amitpamecha.marsrover.model;

public class Rover {

	private Coordinates coordinates;
	private LinearTerrain terrain;
	
	public void landRover(Coordinates coordinates, LinearTerrain terrain){
		this.coordinates=coordinates;
		this.terrain=terrain;
	}
	
	public boolean checkIfCoordinatesWithinBound(int xCoordinate, int yCoordinate){
		
			int[][] grid = terrain.getGrid();
			
			//column
			int xAxis = grid.length-1;
			//row
			int yAxis = grid[0].length-1;
			
			if(xCoordinate<=xAxis && xCoordinate>=0
					&& yCoordinate<=yAxis && yCoordinate>=0){
				return true;
			}
			
			return false;
	}
	
	public void sendRoverLocation(){
		int[][] grid = terrain.getGrid();
		//column
		int xAxis = grid.length-1;
		//row
		int yAxis = grid[0].length-1;
		
		for(int row=yAxis; row>=0; row--){
			for(int column=0; column<=xAxis; column++){
				if(column==coordinates.getxCoordinate() && row==coordinates.getyCoordinate()){
					System.out.print("x");
				}else{
					System.out.print(".");
				}
			}
			System.out.println("");
		}
	}
	
	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
}
