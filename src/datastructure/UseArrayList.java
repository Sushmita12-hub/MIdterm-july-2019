package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseArrayList {

public static void main(String[] args) throws Exception {

	ArrayList<String> myarrary = new ArrayList<>();
	    myarrary.add("NYC");
		myarrary.add("Californiya");
		myarrary.add("Washinton");
		myarrary.add("Florida");


	ConnectToSqlDB connectToSqlDB =new ConnectToSqlDB();
	connectToSqlDB.insertDataFromArrayListToSqlTable(myarrary,"StatesOfUSA","SortingNumber");
	connectToSqlDB.readDataBase("StatesOfUSA","SortingNumber");

	System.out.println("print the all my arrary :" + myarrary);


		System.out.println("*********");
		myarrary.remove(3); // remove elements
	    System.out.println("After removing arrary:" + myarrary);

		System.out.println("******");


	        System.out.println("Using for eachloop:");
	         for (String s : myarrary) { // this is for each loop
			   System.out.println((s));
	         }

			//System.out.println("after using WhileLoop:");

			//Iterator iterator = myarrary.iterator(); // use Iterator
			//while (iterator.hasNext()){
			//System.out.println(iterator.next());
			//}

		}


	}












/*
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     * Store all the sorted data into one of the databases.
     **/


