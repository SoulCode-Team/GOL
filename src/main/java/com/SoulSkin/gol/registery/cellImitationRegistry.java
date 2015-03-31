package com.SoulSkin.gol.registery;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by John on 3/30/2015.
 */
public class cellImitationRegistry {

	private static Map< String, IIcon > imitationList = new HashMap< String, IIcon >();
//	private static IIcon[] imitationList = {};

	// ADDS //
	public static void addItemStack( ItemStack stack ) {
		imitationList.put( stack.getUnlocalizedName(), Block.getBlockFromItem( stack.getItem() ).getIcon( 0, 0 ) );
	}

	public static void addItemStack( ItemStack stack, int side, int meta ) {
		imitationList.put( stack.getUnlocalizedName(), Block.getBlockFromItem( stack.getItem() ).getIcon( side, meta ) );
	}

	public static void addItem( Item item ) {
		imitationList.put( item.getUnlocalizedName(), Block.getBlockFromItem( item ).getIcon( 0, 0 ) );
	}

	public static void addItem( Item item, int side, int meta ) {
		imitationList.put( item.getUnlocalizedName(), Block.getBlockFromItem( item ).getIcon( side, meta ) );
	}

	public static void addBlock( Block block ) {
		imitationList.put( block.getUnlocalizedName(), block.getIcon( 0, 0 ) );
	}

	public static void addBlock( Block block, int side, int meta ) {
		imitationList.put( block.getUnlocalizedName(), block.getIcon( side, meta ) );
	}

	public static void addAll( Object input ) {
		if ( input instanceof ItemStack ) {
			addItemStack( ( ItemStack ) input );
		}
		else if ( input instanceof Item ) {
			addItem( ( Item ) input );
		}
		else if ( input instanceof Block ) {
			addBlock( ( Block ) input );
		}
	}

	public static void addAll( Object input, int side, int meta ) {
		if ( input instanceof ItemStack ) {
			addItemStack( ( ItemStack ) input, side, meta );
		}
		else if ( input instanceof Item ) {
			addItem( ( Item ) input, side, meta );
		}
		else if ( input instanceof Block ) {
			addBlock( ( Block ) input, side, meta );
		}
	}
	// END ADDS //

}
