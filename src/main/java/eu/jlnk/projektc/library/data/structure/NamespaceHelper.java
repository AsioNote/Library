package eu.jlnk.projektc.library.data.structure;

import java.util.ArrayList;
import java.util.List;

import eu.jlnk.projektc.library.error.NamespaceException;

public class NamespaceHelper {
	
	// TODO: write Unit Tests
	
	public static void validateNamespaceElements(List<String> list) throws NamespaceException {
		ArrayList<String> inValide = new ArrayList<>();
		for (String element : list) {
			try {
				validateNamespaceElement(element);
			} catch (NamespaceException e) {
				inValide.add(element);
			}
		}
		if(inValide.size() > 0) {
			throw new NamespaceException("The Strings <" + String.join(", ", inValide) + "> are not a valide Namespace Elements");
		}
	}

	public static void validateNamespaceElement(String element) throws NamespaceException {
		if(!element.matches("[A-Za-z0-9\\-\\_]+")){
			throw new NamespaceException("The String <" + element + "> is not a valide Namespace Element");
		}
	}
}