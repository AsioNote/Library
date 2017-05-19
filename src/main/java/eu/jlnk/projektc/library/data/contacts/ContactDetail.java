package eu.jlnk.projektc.library.data.contacts;

import eu.jlnk.projektc.library.data.Node;

public class ContactDetail extends Node {
	
	private String name;
	private ContactDetailE type;
	private String value;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ContactDetailE getType() {
		return type;
	}
	public void setType(ContactDetailE type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
