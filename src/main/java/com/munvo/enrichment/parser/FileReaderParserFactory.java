package com.munvo.enrichment.parser;

public class FileReaderParserFactory {
	public FileReaderParser createFileReaderParser(String fileType) {
		
		if(fileType.equalsIgnoreCase("JSON")) {
			return new JsonReaderParser();
		}
		
		if(fileType.equalsIgnoreCase("CSV")) {
			return new CsvReaderParser();
		}
		
		return null; // if file type is anything else (incl. null)
	}
}
