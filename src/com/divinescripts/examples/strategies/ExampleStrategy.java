package com.divinescripts.examples.strategies;

import com.divinescripts.examples.utils.Strategy;

public class ExampleStrategy extends Strategy{

	@Override
	public boolean isValid() {
		// check to see if a condition is met
		return false;
	}

	@Override
	public void execute() {
		// if condition is met, execute it
	}

	@Override
	public String getState() {
		// to tell the user what the script is currently doing.
		// also for debug purposes.
		return "Running to so-and-so";
	}

	
}
