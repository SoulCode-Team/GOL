package com.SoulSkin.gol.item;

import com.SoulSkin.gol.lib.ModTextures;
import com.SoulSkin.gol.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by John on 3/30/2015.
 */
public class baseModItem extends Item {

	public baseModItem() {
		super();
		this.setMaxStackSize( 64 );
		this.setCreativeTab( Reference.GOLTAB );
	}

	@SideOnly( Side.CLIENT )
	public void registerIcons( IIconRegister par1registerIcon ) {
		this.itemIcon = par1registerIcon.registerIcon( ModTextures.GetTextureNameFull( this ) );
	}
}
