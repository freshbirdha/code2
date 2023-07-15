
import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLTEST {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("banma.xml");
		SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        
        Element root = document.getRootElement();

        // iterate through child elements of root
        for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
           Element element = it.next();
            // do something
            System.out.println(element.getText());
         }

 

       
	}

}
