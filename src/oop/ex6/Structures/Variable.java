package oop.ex6.Structures;

public class Variable {

	private String name;
	private Type type;
	private String value;
	private boolean initialized;
	private boolean isFinal;

	public Variable(String name, Type type, String value, boolean isFinal){
		this.name = name;
		this.type = type;
		this.value = value;
		this.isFinal = isFinal;
	}

	public Variable(String name, Type type){
		this.name = name;
		this.type = type;
		this.initialized = false;
		this.isFinal = false;
	}

	public boolean isInitialized(){
		return initialized;
	}

	public boolean isFinal() {
		return isFinal;
	}
}
