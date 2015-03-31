package com.SoulSkin.gol.block;

import com.SoulSkin.gol.lib.ModTextures;
import com.SoulSkin.gol.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by John on 3/30/2015.
 */
public class baseModBlock extends Block {

	public baseModBlock( Material material ) {
		super( material );
		this.setCreativeTab( Reference.GOLTAB );
	}

	@SideOnly( Side.CLIENT )
	public void registerIcons( IIconRegister par1registerIcon ) {
//		System.out.println( "_______________________________BLOCK TEXTURE_____________________________________________" );
//		ModLogger.info( "TEXTURE_LOC: " + ACTextures.GetTextureNameFull( this ) );
		this.blockIcon = par1registerIcon.registerIcon( ModTextures.GetTextureNameFull( this ) );
	}

}
