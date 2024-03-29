package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

	private static Configuration instance;
	private String studentName;
	private String type;
	private String fileName;

	private Configuration() {
		Config config = ConfigFactory.load();
		this.studentName = config.getString("name");
		this.type = config.getString("type");
		this.fileName = config.getString("fileName");
	}

	public static synchronized Configuration getInstance() {
		if (instance == null) {
			instance = new Configuration();
		}
		return instance;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getType() {
		return type;
	}

	public String getFileName() {
		return fileName;
	}
}