package com.string.app;

public class StringCompareEmp {
public static void main (String args[]){
	String str = "Hello World";
    String anotherString = "hello world";
    Object objStr = str;

    System.out.println( str.compareToIgnoreCase(anotherString) );
}

}
