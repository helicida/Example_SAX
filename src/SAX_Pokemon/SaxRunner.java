package SAX_Pokemon;


import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


/**
 * Created by 46465442z on 29/10/15.
 */
public class SaxRunner {

    private static String ruta = "/home/46465442z/IdeaProjects/CarrererBCN_SAX/src/SAX_Pokemon/pokemons.xml";

    public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, SAXException {

        SAXParserFactory factory = SAXParserFactory.newInstance();  //Creem una instancia d'una factoria de parser SAX

        InputStream xmlInput = new FileInputStream(ruta);
        SAXParser saxParser = factory.newSAXParser();
        SAXHandler sh = new SAXHandler();

        try{
            saxParser.parse(xmlInput,sh);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
