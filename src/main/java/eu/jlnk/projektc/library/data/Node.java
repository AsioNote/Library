package eu.jlnk.projektc.library.data;

import java.util.List;

import eu.jlnk.projektc.library.data.enums.VisibilityE;
import eu.jlnk.projektc.library.data.structure.Namespace;

public abstract class Node {
	private String id;
	private String date;
	private List<String> tags;
	
	private Node parent;
	
	private VisibilityE visibility = VisibilityE.PRIVATE;
	
	private Namespace namespace;
//	private String remoteName;
	
	private Color color;
	
	private Encryption encryption;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public VisibilityE getVisibility() {
		return visibility;
	}

	public void setVisibility(VisibilityE visibility) {
		this.visibility = visibility;
	}

	public Namespace getNamespace() {
		return namespace;
	}

	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Encryption getEncryption() {
		return encryption;
	}

	public void setEncryption(Encryption encryption) {
		this.encryption = encryption;
	}
}
