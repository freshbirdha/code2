
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XMLTEST2 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("xml.xml");
		SAXReader reader = new SAXReader();
        Document document = reader.read(file);
	    List<Node> list = document.selectNodes("//location");
	    
	  for (Iterator<Node> iter = list.iterator(); iter.hasNext();) {
	        Attribute attribute = (Attribute) iter.next();
	        System.out.println(attribute.getValue());
	
	    } 
	
	    
	 
	
	   
		 

      
      
        
        

       
	}

}
