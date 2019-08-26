package inheritance;
import java.io.*;
import java.util.*;

public class GeoTesting {

	public static void main(String[] args) {
		ArrayList<Geo> cool = new ArrayList<Geo>();
		
		
		cool.add(new Rectangle(1,2));
		cool.add(new Trapezoid(1,2,3,4,5));
		cool.add(new Rectangle(3,4));
		cool.add(new Trapezoid(6,7,8,9,10));
		cool.add(new Rectangle(5,6));
		cool.add(new Trapezoid(11,12,13,14,15));
		
		double largest = -999;
		double largestId = -1;
		String type = "";
		for(int i = 0;i<cool.size();i++)
		{
			if(cool.get(i).getArea()>largest)
			{
				largest = cool.get(i).getArea();
				largestId = i;
				if(cool.get(i) instanceof Rectangle)
				{
					type = "Rectangle";
				} else
				{
					type = "Trapezoid";
				}
			}
		}
		System.out.println("Type = "+type+" Area = "+largest+" Id = "+largestId);
	}
}
