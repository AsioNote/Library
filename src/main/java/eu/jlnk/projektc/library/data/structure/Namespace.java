package eu.jlnk.projektc.library.data.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import eu.jlnk.projektc.library.error.NamespaceException;

public class Namespace {
	
	static final String GLOBAL_KEY = "global:";
	
	private boolean global = false;
	private ArrayList<String> namespace;
	private String alias = "";
	
	Namespace(String namespace) throws NamespaceException {
		global = namespace.startsWith(GLOBAL_KEY);
		if (global) {
			namespace = namespace.replace(GLOBAL_KEY, "");
		}
		
		String[] array = namespace.split("\\.");
		
		List<String> list = Arrays.asList(array);
		
		NamespaceHelper.validateNamespaceElements(list);
		
		this.namespace = new ArrayList<>(list);
	}
	Namespace (String namespace, String alias) throws NamespaceException {
		this(namespace);
		this.alias = alias;
	}
	
	public ArrayList<String> getNamespace() {
		ArrayList<String> r = new ArrayList<>(namespace.size());
		
		// Strings are immutable
		namespace.forEach(s -> r.add(s));
		return r;
	}

	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public boolean isGlobal() {
		return Boolean.valueOf(global);
	}

	@Override
	public String toString() {
		return String.join(".", namespace);
	}

	

}
