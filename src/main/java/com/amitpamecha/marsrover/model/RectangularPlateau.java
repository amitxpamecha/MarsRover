package com.amitpamecha.marsrover.model;

public class RectangularPlateau implements LinearTerrain {

	private int length;
	
	private int breadth;

	private int[][] grid;
	
	public RectangularPlateau(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		initializeGrid(length,breadth,1,1);
	}
	
	public int[][] initializeGrid(int length, int breadth, int blockLength, int blockBreadth){
		int maxGridLength = (int)(length/blockLength);
		int maxGridBreadth = (int) (breadth/blockBreadth);
		this.grid=new int[maxGridLength][maxGridBreadth];
		return grid;
	}
	
	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		this.grid = grid;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
}
