package oop.ex6.main;
import oop.ex6.Structures.GlobalScope;

import java.io.*;
import java.util.*;


public class FileParser {

	public static int parseFile(File file) throws IOException{
		GlobalScope mainScope = new GlobalScope();
		Scanner scanner = new Scanner(file);
		Stack<Boolean> bracketStack = new Stack<Boolean>();

		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			if(bracketStack.empty()){

			}
		}



		return 0;
	}
}
