package com.SoulSkin.gol.util;

import net.minecraft.util.StatCollector;

/**
 * Created by John on 3/30/2015.
 */
public class StringUtils {

	public static String[] GetStringList( String str ) {
		return GetStringList( str, "," );
	}

	public static String[] GetStringList( String str, String splitter ) {
		return str.split( splitter );
	}

	/**
	 * Returns a value indicating whether the given string is null or empty.
	 */
	public static boolean isNullOrEmpty( String str ) {
		return str == null || "".equals( str );
	}

	public static boolean isNullOrEmpty( String[] str ) {
		return ( str == null || str.length <= 0 || "".equals( str ) );
	}

	public static String localize( String unlocalized ) {
		return StatCollector.translateToLocal( unlocalized );

	}
}
