package com.tnsif.day4.hierardemo;

public class HierDemo {

	public static void main(String[] args) {
		/*
		 * ElectronicsGadgets eg=new ElectronicsGadgets();//static binding //tight
		 * coupling //early binding
		 * 
		 * MobilePhones mp=new MobilePhones(); System.out.println(mp);
		 * 
		 * Television tv=new Television(); System.out.println(tv);
		 */
		
		ElectronicsGadgets eg; //Obj ref
		eg=new ElectronicsGadgets();  //dynamic binding  //late binding //run time poly //loose coupling
		System.out.println(eg);
		
		eg=new MobilePhones();
		System.out.println(eg);
		
		eg=new Television();
		System.out.println(eg);

	}

}
