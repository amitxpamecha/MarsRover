package com.amitpamecha.marsrover.model;

public class Coordinates {
	
	//row
	private int xCoordinate;
	//column
	private int yCoordinate;
	
	private Orientation orientation;
	
	public Coordinates(int xCoordinate, int yCoordinate, Orientation orientation){
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
		this.orientation=orientation;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
}
