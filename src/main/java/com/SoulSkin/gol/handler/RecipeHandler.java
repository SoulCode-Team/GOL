package com.SoulSkin.gol.handler;

import com.SoulSkin.gol.gol;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by John on 3/30/2015.
 */
public class RecipeHandler {

	private static gol MOD;

	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void craftingAll() {

		craftingBlocks();
		craftingItems();
		craftingTools();
	}

	public static void smeltingAll() {
	}

	public static void addRecipe( ItemStack result, Object... recipe ) {
		GameRegistry.addRecipe( new ShapedOreRecipe( result, recipe ) );
	}

	// public static void addShapelessRecipe(ItemStack result, Object... recipe)
	// {
	// CraftingManager.getInstance().getRecipeList().add(new
	// ShapelessOreRecipe(result, recipe));
	// }

	public static void addShapelessRecipe( ItemStack result, Object... recipe ) {
		GameRegistry.addRecipe( new ShapelessOreRecipe( result, recipe ) );
	}

	public static void craftingBlocks() {

		// Recipes for Blocks //

		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.quartz_block, 6 ), "stairQuartz", "stairQuartz", "stairQuartz", "stairQuartz" );
		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.dirt ), new ItemStack( Blocks.dirt, 1, 1 ) );
		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.dirt ), new ItemStack( Blocks.dirt, 1, 2 ) );
		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.sand ), new ItemStack( Blocks.sand, 1, 1 ) );
		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.stone, 1, 5 ), new ItemStack( Blocks.stone, 1, 6 ) );
		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.dirt, 1, 3 ), new ItemStack( Blocks.dirt, 1, 4 ) );
		RecipeHandler.addShapelessRecipe( new ItemStack( Blocks.dirt, 1, 1 ), new ItemStack( Blocks.dirt, 1, 2 ) );
		//		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.quartz_block), new ItemStack (Blocks.quartz_block, 1, 1));
		//		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.quartz_block), new ItemStack (Blocks.quartz_block, 1, 2));
	}

	public static void craftingItems() {
		// Recipes for Items //
		RecipeHandler.addRecipe( new ItemStack( gol.instance.smallStarter ), "blockSnow" );
	}

	public static void craftingTools() {
		// Recipes for Tools //
		if ( ConfigHandler.enableAreaController ) {
			RecipeHandler.addRecipe( new ItemStack( MOD.areaController ), true, "igi", "bdb", "ibi", 'g', "blockGlass", 'b', "blockRedstone", 'i', "ingotIron" );
		}
	}
}
