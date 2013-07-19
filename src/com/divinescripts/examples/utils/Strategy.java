package com.divinescripts.examples.utils;

public abstract class Strategy {

	public abstract boolean isValid();
	
	public abstract void execute();
	
	public abstract String getState();
}
