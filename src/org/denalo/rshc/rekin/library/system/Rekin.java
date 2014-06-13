package org.denalo.rshc.rekin.library.system;

import org.denalo.rshc.rekin.library.application.RekinApplication;

public class Rekin
{
	public static RekinApplication application;
	
	public static void initialize ( RekinApplication application ) {
		Debug.print ( "System Starting Initialize..." );
		Rekin.application = application;
		Debug.print ( "System Initialized" );
	}
}
