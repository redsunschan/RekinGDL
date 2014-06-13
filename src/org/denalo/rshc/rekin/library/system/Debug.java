package org.denalo.rshc.rekin.library.system;

import android.util.Log;

public class Debug
{
	public static void print ( String msg ) {
		Log.d ( "Rekin Application Logger" , "[ Rekin Debug ] : " + msg );
	}
	
	public static void warn ( String msg ) {
		Log.w ( "Rekin Application Logger" , "[ Rekin WARN ] : " + msg );
	}
	
	public static void error ( String msg ) {
		Log.wtf ( "Rekin Application Logger" , "[ Rekin ERROR ] : " + msg );
	}
	
}
