package org.denalo.rshc.rekingdl.system;

import android.content.pm.*;
import android.os.*;
import android.view.*;
import org.denalo.rshc.rekingdl.application.*;
import org.denalo.rshc.rekingdl.graphics.*;

public class Rekin
	{
		private static RenderLayer layer;
		private static GameApplication game;
		private static GameConfig config;

		public static void setLayer ( RenderLayer layer )
			{
				Rekin.layer = layer;
			}

		public static RenderLayer getLayer ( )
			{
				return layer;
			} 

		public static void initialize ( GameApplication game , GameConfig config )
			{
				Rekin.setGame ( game );
				Rekin.setConfig ( config );
				Display.initialize ( );
				RenderSet.initialize ( );
			}

		public static void main ( )
			{
				if ( Build.VERSION.SDK_INT < Rekin.getConfig ( ).getLowestSDK ( ) )
					{
						new FCWindow ( "This game only support the device which SDK version higher than " + String.valueOf ( Rekin.getConfig ( ).getLowestSDK ( ) ) );
					}
				if ( Rekin.getConfig ( ).isFullScreen ( ) )
					{
						Rekin.getGame ( ).getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN );
						Rekin.getGame ( ).requestWindowFeature ( Window.FEATURE_NO_TITLE );
					}
				if ( Rekin.getConfig ( ).getScreenOrientation ( ) == Display.Orientation.Horizontal )
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );
					}
				else
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );
					}

				if ( Rekin.getConfig ( ).isLockScreenOrientation ( ) )
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_LOCKED );
					}
				else
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR );
					}
			}

		private static void setConfig ( GameConfig config )
			{
				Rekin.config = config;
			}

		public static GameConfig getConfig ( )
			{
				return config;
			}

		private static void setGame ( GameApplication game )
			{
				Rekin.game = game;
			}

		public static GameApplication getGame ( )
			{
				return game;
			}

	}
