package org.denalo.rshc.rekingdl.system;
import android.util.*;

public class Display
	{

		private static DisplayMetrics metrics = new DisplayMetrics ( );
		private static int width , height;
		private static int maxWidth , maxHeight;

		private static void setMaxWidth ( int maxWidth )
			{
				Display.maxWidth = maxWidth;
			}

		public static int getMaxWidth ( )
			{
				return maxWidth;
			}

		private static void setMaxHeight ( int maxHeight )
			{
				Display.maxHeight = maxHeight;
			}

		public static int getMaxHeight ( )
			{
				return maxHeight;
			}

		private static void setWidth ( int width )
			{
				Display.width = width;
			}

		public static int getWidth ( )
			{
				return Display.width;
			}

		private static void setHeight ( int height )
			{
				Display.height = height;
			}

		public static int getHeight ( )
			{
				return Display.height;
			}

		public static void initialize ( )
			{
				Rekin.getGame ( ).getWindowManager ( ).getDefaultDisplay ( ).getMetrics ( Display.metrics );
				Display.setMaxWidth ( Display.metrics.widthPixels );
				Display.setMaxHeight ( Display.metrics.widthPixels );
				if ( Rekin.getConfig ( ).getWidth ( ) > Display.getMaxWidth ( ) || Rekin.getConfig ( ).getHeight ( ) > Display.getMaxHeight ( ) )
					{
						Display.setWidth ( Display.getMaxWidth ( ) );
						Display.setHeight ( Display.getMaxHeight ( ) );
					}
				else
					{
						Display.setWidth ( Rekin.getConfig ( ).getWidth ( ) );
						Display.setHeight ( Rekin.getConfig ( ).getWidth ( ) );
					}
			}

		public static enum Orientation
			{
				Vertical,
				Horizontal
				}
	}
