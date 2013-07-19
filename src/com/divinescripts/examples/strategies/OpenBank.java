package com.divinescripts.examples.strategies;

import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.wrappers.node.SceneObject;

import com.divinescripts.examples.utils.Constants;
import com.divinescripts.examples.utils.Strategy;

public class OpenBank extends Strategy {
	
	//Simple example I put together.
	
	@Override
	public boolean isValid() {
		return !Bank.isOpen();
	}

	@Override
	public void execute() {
		Bank.open();
	}

	@Override
	public String getState() {
		return "Opening bank";
	}

}
