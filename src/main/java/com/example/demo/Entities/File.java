package com.example.demo.Entities;


public class File {
	public String path; 
	public String filename ;
	public String fileDownloadUri;
	
	public File(String path, String filename,String fileDownloadUri) {
		super();
		this.path = path;
		this.filename = filename;
		this.fileDownloadUri = fileDownloadUri;
	}
	public File() {
		
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	
	
	 
}
