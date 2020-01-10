package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CsvReaderParser implements FileReaderParser {
	public Subscriber parseSubscriber(String subLine) {
			String[] words = subLine.split(",");
			return new Subscriber(Integer.parseInt(words[0]), words[1], words[2]);
	}
}
