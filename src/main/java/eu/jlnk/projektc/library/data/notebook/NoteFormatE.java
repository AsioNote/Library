package eu.jlnk.projektc.library.data.notebook;

public enum NoteFormatE {
	HTML("html;htm"),
	MD("md;markdown"),
	ZIM("txt"),
	ZIM_NOTEBOOK("zim");
	
	String fileExtension;
	
	NoteFormatE(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFileExtension() {
		return fileExtension;
	}

}
