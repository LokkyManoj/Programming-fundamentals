package com.chainsys.jfs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexConcept {

	public static void main(String[] args) {
		int count=0;
		String s="man manner manly ";
		Pattern p=Pattern.compile("ma");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
			count++;
			
			
		}
		System.out.println(count);
	}

}
