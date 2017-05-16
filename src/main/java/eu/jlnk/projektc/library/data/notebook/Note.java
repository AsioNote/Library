package eu.jlnk.projektc.library.data.notebook;

import eu.jlnk.projektc.library.data.Node;

public class Note extends Node {
	
	private NoteFormatE format;
	private String filePath;
	
	public NoteFormatE getFormat() {
		return format;
	}
	public void setFormat(NoteFormatE format) {
		this.format = format;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	

}
