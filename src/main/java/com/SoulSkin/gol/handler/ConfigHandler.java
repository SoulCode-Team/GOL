package com.SoulSkin.gol.handler;

import com.SoulSkin.gol.lib.Reference;
import com.SoulSkin.gol.util.ModLogger;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by John on 3/30/2015.
 */
public class ConfigHandler {

	public static Configuration config;

	public static void init( File configFile ) {
		if ( config == null ) {
			config = new Configuration( configFile );
		}

		loadConfigs();

	}

	@SubscribeEvent
	public void onConfigurationChangedEvent( ConfigChangedEvent.OnConfigChangedEvent event ) {
		if ( event.modID.equalsIgnoreCase( Reference.MOD_ID ) ) {
			loadConfigs();
		}
	}

	public static final boolean True  = true;
	public static final boolean False = false;

	public static int     rangeAreaController;
	public static boolean disableAllGolBlocks;
	public static boolean disableTerminators;
	public static boolean enableAreaController;

	public static void loadConfigs() {
		ModLogger.info( "Loading Configs" );
		// Configs for Blocks//
		disableAllGolBlocks = config.get( Reference.DISABLE_BLOCKS_CATEGORY, "Disable All GOL Blocks", false, "If a world is loaded with this set to True, ALL GOL BLOCKS WILL BE DESTROYED. This cannot be undone." ).getBoolean();
		disableTerminators = config.get( Reference.DISABLE_FUNCTIONS_CATEGORY, "Disable Boundary Blocks", false, "Disables blocks that stop GOL from changing blocks where unwanted" ).getBoolean();

		// Configs for Tools//
		enableAreaController = config.get( Reference.TOOLS_CATEGORY, "Enable Area Controller", true, "Area Controller can control GOL blocks in surrounding area." ).getBoolean();
		rangeAreaController = config.get( Reference.TOOLS_CATEGORY, "Area Controller Range", true, "the distance from the player in which the Area Controller can control GOL blocks." ).getInt();

		if ( config.hasChanged() ) {
			config.save();
		}
	}
}
