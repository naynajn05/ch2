package com.tnsif.executor;

import com.tnsif.StatementInterface.ServiceClass;
import com.tnsif.util.DBUtil;

public class Executor {

	public static void main(String[] args) {
		//DBUtil.establishConnetion();
		ServiceClass.addEmp(7, "Sahil", 69000);
		//ServiceClass.validateEmp(2);
		ServiceClass.showEmp();
		System.out.println("________________");
		ServiceClass.updateName(2, "Nayna");
		ServiceClass.updateSalary(5, 75000);
		ServiceClass.showEmp();
		
		
	}

}
