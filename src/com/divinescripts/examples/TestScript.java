package com.divinescripts.examples;

import java.util.ArrayList;

import org.powerbot.core.script.ActiveScript;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.util.Random;

import com.divinescripts.examples.strategies.*;
import com.divinescripts.examples.utils.*;

@Manifest(authors = { "DivineScripts" }, description = "Test Script for SW Application", name = "Test Script")
public class TestScript extends ActiveScript {

	private static ArrayList<Strategy> strategies = new ArrayList<Strategy>();

	private static boolean canStart;
	public String currentState = "Starting up...";
	
	public void onStart() {
		addStrategies(new ExampleStrategy());
		canStart = true;
	}

	@Override
	public int loop() {
		if (canStart) {
			for(Strategy strategy : strategies) {
				if(strategy.isValid()) {
					currentState = strategy.getState();
					strategy.execute();
				}
			}
		}
		return Random.nextInt(200, 300);
	}

	private void addStrategies(Strategy... strats) {
		for(Strategy s : strats) {
			strategies.add(s);
		}
	}
	
}
