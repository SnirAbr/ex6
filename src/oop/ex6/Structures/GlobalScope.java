package oop.ex6.Structures;

import java.util.*;

public class GlobalScope {
	private static ArrayList<Scope> methods;
	private static ArrayList<Variable> globalVariables;

	public GlobalScope(){
		methods = new ArrayList<Scope>();
		globalVariables = new ArrayList<Variable>();
	}

	public void addMethod(Scope method){
		methods.add(method);
	}

	public boolean addVariable(String text){
		return true;
	}

}
