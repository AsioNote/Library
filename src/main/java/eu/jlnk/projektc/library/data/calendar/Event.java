package eu.jlnk.projektc.library.data.calendar;

public class Event extends TodoItem {
	
	private DateTime start;
	private DateTime end;
	
	
	public DateTime getStart() {
		return start;
	}
	public void setStart(DateTime start) {
		this.start = start;
	}
	public DateTime getEnd() {
		return end;
	}
	public void setEnd(DateTime end) {
		this.end = end;
	}

}
