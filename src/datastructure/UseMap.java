package datastructure;

import databases.ConnectToSqlDB;
import databases.User;

import java.util.*;

public class UseMap {



	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data
		 *
		 * .
		 */

		List<String> fruits= new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Grape");
		fruits.add("orange");


		List<String> flower = new ArrayList<>();
		flower.add("Rose");
		flower.add("Tuilip");
		flower.add("Sunflower");

		List<String> phone =new ArrayList<>();
		phone.add("I phn");
		phone.add("Samsung");
		phone.add ("Nokia");





	LinkedHashMap<String, List<String>> fruthsAndflowerAndphone = new LinkedHashMap<>();
		fruthsAndflowerAndphone.put("This is fruits name: ",  fruits);
		fruthsAndflowerAndphone.put("This is flower name: ",flower);
		fruthsAndflowerAndphone.put("This is my phone:",phone);


				for (Map.Entry <String,List<String>> entry: fruthsAndflowerAndphone.entrySet())
					System.out.println(entry.getKey() + " " + entry.getValue());



//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//
//		connectToSqlDB. insertDataFromStringToSqlTable("fruits","Fruit_table");
//
//		connectToSqlDB.insertDataFromArrayListToSqlTable(, "flower_table","nameOfFlower");
//
//
//		List<String> retrievedFruit = ConnectToSqlDB.readUserProfileFromSqlTable("Fruit_table");
//
//		System.out.println("Retrieving Fruits....");
//		for(String fruit: retrievedFruit) {
//			System.out.println(fruit);
//		}
//
//		List<String> retrievedFlower = ConnectToSqlDB.readUserProfileFromSqlTable("flower_table");
//
//		System.out.println("Retrieving Flower....");
//		for(String flower: retrievedFlower) {
//			System.out.println(flower);
//		}


	}
}
//connectToSqlDB.insertDataFromArrayToSqlTable(nameOfFruit, "fruit_table");
//


