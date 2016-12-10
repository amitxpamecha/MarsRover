package com.amitpamecha.marsrover.model;

public interface LinearTerrain {
	
	public int[][] getGrid();
	
	public int getLength();

	public int getBreadth();
	
	public int[][] initializeGrid(int length, int breadth, int blockLength, int blockBreadth);
}
