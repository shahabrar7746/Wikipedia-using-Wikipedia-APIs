import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.*;
public class Startin_point {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		// This file is an starting point of our project.from here our program where to go
		//
Scanner s = new Scanner(System.in);
/*This projects works as wikipedia. It takes info of anything or about anything using wikipedia API
 * API takes info from wikipedia database.
 * This project works in two different ways offline and online that means if anything already 
 * Searched in program then it wont call API instead it will call file_reader class for reading 
 * existing API response for the search.This will make our program to work offline if internet is not there
 * if not found existing response of API then it will Wikipedia_API class to get info from 
 * wikipedia database
 * 
 * 
 *  */
System.out.print("WELCOME TO WIKIPEDIA\nSearch: ");
String search = s.nextLine();//This variable will be used to take input from user 
search = search.replace(" ", "_");//This line will replace all the space in String with underscore using
//Replacement method.

File f = new File("C:\\My Wikipedia\\" + search + ".txt");
if(f.exists()) {
/*
 * if there is a file with same name as of search Query then it will call File_reader to Take and show  
 * important data from file 
 * Then it will take an img address from file and it will pass that address to img_viewer  class 
 * for processing
 */
	File_reader fr = new File_reader();
	fr.file_reader(search);//File_reader will be called using this method it will take String as a parameter
	
}else {
	Wikipedia_API WKP = new Wikipedia_API();
	WKP.wiki_search(search);
	/*
	 * Above method will call a method from Wikipedia_API class file for taking  API response
	 */
}
	}

}
