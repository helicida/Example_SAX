package SAX_Pokemon;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Created by 46465442z on 29/10/15.
 */
public class SAXHandler extends DefaultHandler {

    int contador_pokemon = 0;
    boolean pokemon = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("Nombre")){
            contador_pokemon++;
            System.out.print(contador_pokemon + " - El tipus del pokemon és " + attributes.getValue("Classe"));
            pokemon = true;
        }
    }


    @Override

    public void characters(char[] ch, int start, int length) throws SAXException {  //Es queda amb el valor de cadascuna de l'etiqueta
        if(pokemon){
            System.out.print(" i s'anomena " + new String(ch, start, length) + "\n");
            pokemon = false;
        }

    }

}