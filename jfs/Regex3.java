package com.chainsys.jfs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		String str="abc";
		Pattern p=Pattern.compile("[\\D]");
		Matcher m=p.matcher(str);
		if(m.find()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not Valid");
		}
		


	}

}
