package com.tnsif.lamdademo;

class MyCubeImpl implements MyCube
{

	@Override
	public int getCube(int no) {
		return no*no*no;
	}
	
}




public class OldWay {

	public static void main(String[] args) {
		//1.Using object of a class
	MyCube c=new MyCubeImpl();
	System.out.println(c.getCube(3));

	
	//2. anonymous class
	
	MyCube c1=new MyCube()
			{
			
		 public int getCube(int no)
		{
			return no*no*no;
		}
			
	};
	System.out.println(c1.getCube(2));

}
}
