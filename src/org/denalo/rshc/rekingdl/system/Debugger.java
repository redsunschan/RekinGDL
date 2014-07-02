package org.denalo.rshc.rekingdl.system;

import android.util.*;

public class Debugger
{
	protected static long totalFrame = 0;
	
	public static void countFrame ( ) {
		totalFrame++;
		Log.v ( Debugger.class.getSimpleName ( ) , "Total Rendered Frame : " + String.valueOf (  totalFrame ) );
	}
}
