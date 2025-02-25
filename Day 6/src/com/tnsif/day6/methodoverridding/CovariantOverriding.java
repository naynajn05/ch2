package com.tnsif.day6.methodoverridding;

class Color
{
	public Color getColor()
	{
		Color c=new Color();
		return c;
	}
}

class Red extends Color
{
	public Red getColor()
	{
		Red r=new Red();
		return r;
	}
}

class Green extends Color
{
	public Green getColor()
	{
		Green g=new Green();
		return g;
	}

}

public class CovariantOverriding {

	public static void main(String[] args) {
	Color color=new Color();
	
	Color c1=color.getColor();
	System.out.println(c1);
	
	Red red=new Red();
	Red r1=red.getColor();
	System.out.println(r1);

	}

}
