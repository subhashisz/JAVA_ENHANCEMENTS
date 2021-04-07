package com.myapp.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
	public String processFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			return br.readLine();
		}

	}
}