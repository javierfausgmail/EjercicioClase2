package uf1290.ficheros.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;


public class Principal {

	/*
	 * Escribe en un fichero XML el contenido de la lista que se le pasa como par�metro
	 */
	public void escribirXML(ArrayList<Persona> listaPersonas) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document documento = null;
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation dom = builder.getDOMImplementation();
			documento = dom.createDocument(null,  "xml", null);
			
			Element raiz = documento.createElement("Personas");
			documento.getDocumentElement().appendChild(raiz);
			
			Element nodoPersona = null, nodoDatos = null;
			Text texto = null;
			for (Persona persona : listaPersonas) {
				nodoPersona = documento.createElement("Persona");
				raiz.appendChild(nodoPersona);
				
				nodoDatos = documento.createElement("nombre");
				nodoPersona.appendChild(nodoDatos);
				
				texto = documento.createTextNode(persona.getNombre());
				nodoDatos.appendChild(texto);
				
				nodoDatos = documento.createElement("apellidos");
				nodoPersona.appendChild(nodoDatos);
				
				texto = documento.createTextNode(persona.getApellidos());
				nodoDatos.appendChild(texto);
			}
			
			Source source = new DOMSource(documento);
			Result resultado = new StreamResult(new File("archivoPersonas.xml"));
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, resultado);
			
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerConfigurationException tce) {
			tce.printStackTrace();
		} catch (TransformerException te) {
			te.printStackTrace();
		}
	}
	
	/*
	 * Lee un fichero XML y muestra el contenido por pantalla
	 * TODO Almacenar el contenido en vez de mostrarlo por pantalla
	 */
	public void leerFicheroXML() {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document documento = null;
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			documento = builder.parse(new File("archivoPersonas.xml"));
			
			// Recorre cada uno de los nodos 'Persona'
			NodeList personas = documento.getElementsByTagName("Persona");
			for (int i = 0; i < personas.getLength(); i++) {
				Node persona = personas.item(i);
				Element elemento = (Element) persona;

				System.out.print(elemento.getElementsByTagName("nombre").item(0).
						getChildNodes().item(0).getNodeValue());
				System.out.print(" ");
				System.out.print(elemento.getElementsByTagName("apellidos").item(0).
						getChildNodes().item(0).getNodeValue());
				System.out.println();
			}
			
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException saxe) {
			saxe.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		
		ArrayList<Persona> listaPersonas = null;
		
		Persona persona1 = new Persona("Nombre1", "Apellido1");
		Persona persona2 = new Persona("Nombre2", "Apellido2");
		Persona persona3 = new Persona("Nombre3", "Apellido3");
		
		listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		Principal principal = new Principal();
		principal.escribirXML(listaPersonas);
		principal.leerFicheroXML();
	}
}
