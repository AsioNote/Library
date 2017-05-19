package eu.jlnk.projektc.library.data;

import java.util.List;

import eu.jlnk.projektc.library.data.calendar.DateTime;
import eu.jlnk.projektc.library.data.structure.Namespace;

public abstract class BaseNode {
	
	private String id;
	private DateTime creationDate;
	private DateTime modificationDate;
	private List<String> tags;
	private BaseNode parent;
	private Namespace namespace;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(DateTime creationDate) {
		this.creationDate = creationDate;
	}
	public DateTime getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(DateTime modificationDate) {
		this.modificationDate = modificationDate;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public BaseNode getParent() {
		return parent;
	}
	public void setParent(BaseNode parent) {
		this.parent = parent;
	}
	public Namespace getNamespace() {
		return namespace;
	}
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}
}
