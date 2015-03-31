package com.SoulSkin.gol.handler;

import com.SoulSkin.gol.gol;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by John on 3/30/2015.
 */
public class GameRegisteryHandler {

	public static gol MOD;

	public static void registerItems() {
		// Register Items//
		if ( ConfigHandler.enableAreaController ) {
			GameRegistry.registerItem( MOD.areaController, MOD.areaController.getUnlocalizedName() );
		}
	}

	public static void registerBlocks() {
		GameRegistry.registerBlock( MOD.boundary, MOD.boundary.getUnlocalizedName() );
		GameRegistry.registerBlock( MOD.controller, MOD.controller.getUnlocalizedName() );
		GameRegistry.registerBlock( MOD.lifeCell, MOD.lifeCell.getUnlocalizedName() );
	}

	public static void registerAll() {
		registerItems();
		if ( !ConfigHandler.disableAllGolBlocks ) {
			registerBlocks();
		}
	}
}
