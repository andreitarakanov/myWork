 package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class HexGrid {
	private GamePiece[][] grid;
	public int getGamePieceCount()
	{ 
		int counte = 0;
		for(int i = 0;i<grid.length;i++)
		{
			for(int j = 0;j<grid[0].length;j++)
			{
				if(grid[i][j] != null)
				{
					counte++;
				}
			}
		}
		return counte;
	}
	public ArrayList<GamePiece> isAbove(int row, int col)
	{
		ArrayList<GamePiece> cool = new ArrayList<GamePiece>();
		for(int i = row;i>0;i--)
		{
			if(grid[i][col] !=null) {
				cool.add(grid[i][col]);
				
			}
		}
		return cool;
		
	}
	public void addRandom(int num)
	{
		Random cool = new Random();
		//if()
	}
	
	
}
