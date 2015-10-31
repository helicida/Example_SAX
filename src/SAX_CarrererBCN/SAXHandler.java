package SAX_CarrererBCN;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Created by 46465442z on 29/10/15.
 */
public class SAXHandler extends DefaultHandler{

    int contador_carrers = 0;
    boolean carrer = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if(qName.equalsIgnoreCase("nom_oficial")){
            contador_carrers++;
            System.out.println(contador_carrers);
            carrer = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {  //Es queda amb el valor de cadascuna de l'etiqueta
        if(carrer){
            System.out.println("El carrer s'anomena " + new String(ch, start, length));
            carrer = false;
        }

    }
}
