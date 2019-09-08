package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	BufferedReader br;
	FileReader fr ;

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		FileReader fr = null;
		String fileName = "/Users/rajesh/IdeaProjects/MidtermJuly2019/src/data/self-driving-car";
		try{
			fr =new FileReader(fileName);
			br = new BufferedReader(fr);
			String CurrentLine;
			while ((CurrentLine = br.readLine())!=null){
				System.out.println(CurrentLine);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println();
		}finally {
			br.close();
			fr.close();

		}}}



		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";






