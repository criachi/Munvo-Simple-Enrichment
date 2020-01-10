package com.munvo.enrichment.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.munvo.enrichment.model.Subscriber;

public class JsonReaderParser implements FileReaderParser {
	public Subscriber parseSubscriber(String subLine) {
		ObjectMapper objMapper = new ObjectMapper();
		Subscriber subscriber = null;
		try {
			subscriber = objMapper.readValue(subLine, Subscriber.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return subscriber;
	}
}
