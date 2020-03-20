package loose.oose.fis.processors;

import java.util.ArrayList;

import loose.oose.fis.documents.Document;

public class Process implements Procesor{
	private String str;
	
	public Process(String s) {
		str = s;
	}
	
	public String toString() {
		return str;
	}

	@Override
	public int proceseaza(ArrayList<Document> documente) {
		System.out.println("Proces: ");
		return 0;
	}
	
}
