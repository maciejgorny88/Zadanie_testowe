import java.io.File;
import javax.xml.bind.*;

public class LoadXML {
	private String path;
	
	public LoadXML(String path) {
		this.path = path;
	}
	
	public BreakfastMenu GetMenu() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(BreakfastMenu.class);
		
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File xml = new File(path);
		BreakfastMenu menu = (BreakfastMenu) unmarshaller.unmarshal(xml);
		return menu;					
	}

}
