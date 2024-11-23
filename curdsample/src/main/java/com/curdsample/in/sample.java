package com.curdsample.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sample {
	
	public static void main(String[] args) {
		
		List<String> duplicate = new ArrayList<>(Arrays.asList("apple","cat","apple","cat"));
		
		List<String> removeduplicate = duplicate.stream().distinct().collect(Collectors.toList());
		
	System.out.println(removeduplicate);
		
	}
}

