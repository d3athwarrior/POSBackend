package com.Hotelsoft.TestClasses;

import com.Hotelsoft.JavaClasses.JsonAggregator;

public class Test {
	/*
	 * Class to perform tests on the POSBackendProject
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * GetDepartments men = new GetDepartments(); 
		 * GetMenu items = new GetMenu(); 
		 * GetGroups groups = new GetGroups();
		 * men.returnDepartments(); 
		 * items.returnMenuItems();
		 * groups.returnGroupList();
		 */
			JsonAggregator j = new JsonAggregator();
			j.getAllJson();
	}
}
