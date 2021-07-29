import java.awt.Desktop;
import java.net.URI;

public class img_viewer {
public void img_viewer(String img_address) {
	Desktop d = Desktop.getDesktop();
	try {
		//This method will take img address from file_reader class for processing the browsing image in deafult browser.
		//This method will be callled from File_reader class file.
		d.browse(new URI("https:" + img_address)) ;
	}catch(Exception e) {
		System.out.println("Can't process image");
		
}
}
}
