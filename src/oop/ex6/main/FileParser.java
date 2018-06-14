package oop.ex6.main;
import oop.ex6.Structures.*;

import java.io.*;
import java.util.*;


public class FileParser {

	public static int parseFile(File file) throws IOException{
		GlobalScope mainScope = new GlobalScope();
		Scanner scanner = new Scanner(file);
		Stack<Boolean> bracketStack = new Stack<Boolean>();

		while(scanner.hasNextLine()){
			ArrayList<String> buffer = new ArrayList<String>();
			String line = scanner.nextLine();
			if(bracketStack.empty()){ //in main scope

			}
			else{//inside method
				//search for new bracket open/closure
				//open bracket ->
				

			}
		}


		for(Scope method : mainScope.getMethods()){
			//do something
		}

		return 0;
	}
}
