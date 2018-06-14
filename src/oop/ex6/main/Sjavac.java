package oop.ex6.main;
import java.io.*;

public class Sjavac {

	private static final String USAGE_ERROR = "Wrong Usage";

	public static void main(String[] args) {
		if (args.length != 1){
			System.err.println(USAGE_ERROR);
			return;
		}
		String fileName = args[0];
		File javaFile = new File(fileName);
		int result = FileParser.parseFile(javaFile);
	}

}
