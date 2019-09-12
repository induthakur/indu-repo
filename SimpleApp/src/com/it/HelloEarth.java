package com.it;

import java.util.ArrayList;
import java.util.List;

public class HelloEarth {
	//static String[] names = { "indrajeet", "ashish", "abhishek", "chhavi", "shrashti" };
 static List<String> list;
	public static void main(String[] args) {
       list=new ArrayList<>();
       list.add("indrajeet");
       list.add("ashish");
       list.add("abhishek");
       list.add("chhavi");
       list.add("shrashti");
       System.out.println("");
		for (String name : list) {
			System.out.println(name);
		}
	}

}
