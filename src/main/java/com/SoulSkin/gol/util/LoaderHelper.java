package com.SoulSkin.gol.util;

import cpw.mods.fml.common.Loader;

/**
 * Created by John on 3/30/2015.
 */
public class LoaderHelper {

	public static boolean isWildcardModLoaded( String modidSubstring ) {
		return ( getWildcardModId( modidSubstring ).length > 0 );
	}

	public static String[] getWildcardModId( String modidSubstring ) {
		String[] returnStringArray = null;
		String[] setStrings        = ( String[] ) Loader.instance().getIndexedModList().keySet().toArray();
		for ( String s : setStrings ) {
			if ( s.contains( modidSubstring ) && Loader.isModLoaded( s ) ) {
				returnStringArray[returnStringArray.length] = s;
			}
		}
		return returnStringArray;
	}
}
