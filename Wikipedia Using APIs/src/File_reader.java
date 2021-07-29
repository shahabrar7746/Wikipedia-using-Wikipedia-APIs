import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class File_reader {
public void file_reader(String toSearch) throws FileNotFoundException {
	File f_reader = new File("C:\\My Wikipedia\\" + toSearch+".txt");
	Scanner sc = new Scanner(f_reader);
	//NOTE : EXISTING FILE WILL ALREADY HAVE PARSED DATA 
	String img_address = "";//This variable will store img address which will further use for img processing for img_viewer class file
	
	while(sc.hasNext()) {//this loop will read all the data from file to get important data like name,description and img address
		String temp = sc.nextLine();
	String testing = "";
		if(temp.contains("title")) {
		for(int i = 0;i<temp.length();i++) {
			if(temp.charAt(i) == ':') {
				System.out.println("Name          " + temp.substring(i, temp.length()));
				break;
			}
		}
		}if(temp.contains("description")) {
			for(int i = 0;i<temp.length();i++) {
				if(temp.charAt(i) == ':') {
					System.out.println("Description   " + temp.substring(i, temp.length()));
					break;
				}
			}
	
		
		if(temp.contains("url") && temp.contains("upload")) {
			for(int i = 0;i<temp.length();i++) {
				if(temp.charAt(i) == ':') {
				
					img_address =  temp.substring(i+2, temp.length()-1);
					System.out.println("Image Address :" + img_address);
					break;
				}
			}
			
		}
		}
	}
	img_viewer iv = new img_viewer();
	iv.img_viewer(img_address);
	
}
}

