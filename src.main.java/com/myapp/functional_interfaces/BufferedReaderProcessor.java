package com.myapp.functional_interfaces;
import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
	String process(BufferedReader br) throws IOException;

}
