package com.SoulSkin.gol.block.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by John on 3/30/2015.
 */
public class tileController extends TileEntity {

	private int cellCount = 0;

	public int getCount() {
		return cellCount;
	}

	public void setCount( int count ) {
		this.cellCount = count;
	}

	//NBT Storage//

	public void readFromNBT( NBTTagCompound par1NBTTagCompound ) {
		super.readFromNBT( par1NBTTagCompound );
		this.cellCount = par1NBTTagCompound.getInteger( "cellCount" );
	}

	@Override
	public void writeToNBT( NBTTagCompound par1NBTTagCompound ) {
		super.writeToNBT( par1NBTTagCompound );
		par1NBTTagCompound.setInteger( "cellCount", this.cellCount );
	}
}
