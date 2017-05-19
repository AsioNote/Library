package eu.jlnk.projektc.library.data;

import eu.jlnk.projektc.library.data.enums.VisibilityE;

public abstract class Node extends BaseNode {
	
	private Node parent;
	private VisibilityE visibility = VisibilityE.PRIVATE;
//	private String remoteName;
	private Color color;
	
	private Encryption encryption;

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
