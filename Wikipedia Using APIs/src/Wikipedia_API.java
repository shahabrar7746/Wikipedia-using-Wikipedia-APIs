import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Wikipedia_API {
public void  wiki_search(String toSearch) throws MalformedURLException  {
	//This will be only called if there is no file is available.
			// TODO Auto-generated method stub
//Below is an address of wikipedia API which will be used to process request and response from
	//wikipedia database
	String url = "https://en.wikipedia.org/w/rest.php/v1/search/page?q=" + toSearch + "&limit=1";
	URL obj = new URL(url);
	try {
		HttpURLConnection hu = (HttpURLConnection) obj.openConnection();
		hu.setRequestMethod("GET");//This is an method that API will use.
		BufferedReader in = new BufferedReader(new InputStreamReader(hu.getInputStream()));
		String inputlines;
		StringBuffer sb = new StringBuffer();
		while((inputlines = in.readLine()) != null){
			sb.append(inputlines);
		}
String response = sb.toString();//This variable will store API response in String format 

parser p = new parser();
		p.parser(response,toSearch);//This method will a function from parser class for 
		//approperiate arrangement of data that we got from API response
		//tosearch variable is to be used to make file with that name which will be used while offline search
	} catch (Exception e) {
	if(toSearch.isEmpty()) {
		System.out.println("Can't search an empty space");
	}else {
		System.out.println("No Internet Available");
	}
		
	}
}
}
