package eu.jlnk.projektc.library.data.calendar;

import eu.jlnk.projektc.library.data.Node;

public class TodoItem extends Node {

	private String title;
	private String description;
	private short percentageDone;
	private DateTime deadline;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public short getPercentageDone() {
		return percentageDone;
	}
	public void setPercentageDone(short percentageDone) {
		this.percentageDone = percentageDone;
	}
	public DateTime getDeadline() {
		return deadline;
	}
	public void setDeadline(DateTime deadline) {
		this.deadline = deadline;
	}	
}
