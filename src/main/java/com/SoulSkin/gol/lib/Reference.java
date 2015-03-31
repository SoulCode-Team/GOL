package com.SoulSkin.gol.lib;

import com.SoulSkin.gol.gol;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by John on 3/30/2015.
 */
public class Reference {

	// General @Mod related constants //
	public static final String MOD_ID       = "gol";
	public static final String MOD_NAME     = "Game of Life";
	public static final String VERSION      = "@VERSION@";
	public static final String BASE_PACKAGE = "com.SoulSkin.gol";
	public static final String MOTD         = "@DATA";
	public static final String FINGERPRINT  = "@FINGERPRINT@";
//	public static final String GUI_FACTORY_CLASS = "com.SoulSkin.gol.client.gui.GuiFactory";

	// Creative tab //
	public static final CreativeTabs GOLTAB = gol.tabGOL;

	// Proxy locations //
	public static final String PROXY_CLIENT = BASE_PACKAGE + ".proxy." + "ClientProxy";
	public static final String PROXY_COMMON = BASE_PACKAGE + ".proxy." + "CommonProxy";

	// Config Categories//
	public static final String DISABLE_BLOCKS_CATEGORY    = "Disable.Blocks";
	public static final String DISABLE_FUNCTIONS_CATEGORY = "Disable.Functions";
	public static final String TOOLS_CATEGORY             = "Tools";

	// Texture locations //
	public static final String TOOL_FOLDER          = "tool/";
	public static final String FOOD_FOLDER          = "food/";
	public static final String ARMOR_FOLDER         = "armor/";
	public static final String ARMOR_SUIT_FOLDER    = "armor/suit/";
	public static final String ARMOR_OVERLAY_FOLDER = "textures/models/armor/";
	public static final String GUI_FOLDER           = "gui/";

	// General texture references //
	public static final String IMG_EXTENSION = ".png";
}