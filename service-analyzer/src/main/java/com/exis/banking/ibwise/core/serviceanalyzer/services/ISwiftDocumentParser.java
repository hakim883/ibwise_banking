package com.exis.banking.ibwise.core.serviceanalyzer.services;

import java.io.IOException;

public interface ISwiftDocumentParser {

	public void parse(String file) throws IOException;
}
