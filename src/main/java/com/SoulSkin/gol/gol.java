package com.SoulSkin.gol;

import com.SoulSkin.gol.handler.*;
import com.SoulSkin.gol.lib.Reference;
import com.SoulSkin.gol.proxy.CommonProxy;
import com.SoulSkin.gol.registery.cellImitationRegistry;
import com.SoulSkin.gol.util.ModLogger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by John on 3/30/2015.
 */
@Mod( name = Reference.MOD_NAME, version = Reference.VERSION, useMetadata = false, modid = Reference.MOD_ID )
public class gol {

	@Mod.Instance( Reference.MOD_ID )
	public static gol instance;

	@SidedProxy( clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON )
	public static CommonProxy proxy;

	public static CreativeTabs tabGOL = new CreativeTabs( Reference.MOD_ID ) {
		public ItemStack getIconItemStack() {
			return new ItemStack( gol.controller );
		}

		@Override
		public Item getTabIconItem() {
			return null;
		}
	};

	// Define Tools//
	public static Item smallStarter;
	public static Item areaController;

	// Define Blocks //
	public static Block boundary;
	public static Block controller;
	public static Block lifeCell;

	@Mod.EventHandler
	public void preInit( FMLPreInitializationEvent event ) {
		ModLogger.info( "Loading " + Reference.MOD_NAME );
		ModLogger.info( Reference.MOD_NAME + "would like to say: " + Reference.MOTD );
		proxy.registerRenderers();

		ConfigHandler.init( event.getSuggestedConfigurationFile() );
	}

	@Mod.EventHandler
	public void init( FMLInitializationEvent event ) {
		GameRegisteryHandler.registerAll();
		RecipeHandler.craftingAll();
		OreDictionaryHandler.registerAll();
	}

	@Mod.EventHandler
	public void postInit( FMLPostInitializationEvent event ) {
	}

	@Mod.EventHandler
	public void imfReceiver( FMLInterModComms.IMCEvent event ) {
		for ( final FMLInterModComms.IMCMessage imcMessage : event.getMessages() ) {
			if ( imcMessage.key.equalsIgnoreCase( "ItemStack-add" ) ) {
				if ( imcMessage.isItemStackMessage() ) {
					cellImitationRegistry.addItemStack( imcMessage.getItemStackValue() );
				}
			}
			if ( imcMessage.key.equalsIgnoreCase( "Block-add" ) ) {
				if ( imcMessage.isStringMessage() ) {
					cellImitationRegistry.addBlock( Block.getBlockFromName( imcMessage.getStringValue() ) );
				}
			}
		}
	}
}
