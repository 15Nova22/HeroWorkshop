package com.avaruus.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

	public static String[] ReadStringLinesFromFile(String path) {
		String name = FileReader.class.getResource(path).toString();
		name = name.substring(6);
		File file = new File(name);
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
			String str;
			while ((str = reader.readLine()) != null) {
				list.add(str);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {			
			e.printStackTrace();
			return null;
		} 
		
	 int length = list.size();
	 String[] arr = new String[length];
	 for (int i = 0; i < length; i++) {
		 arr[i] = list.get(i);
	 }
	 return arr;
	}
}
