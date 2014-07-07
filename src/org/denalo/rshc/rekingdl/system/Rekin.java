package org.denalo.rshc.rekingdl.system;

import android.content.pm.*;
import android.content.res.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import java.io.*;
import org.denalo.rshc.rekingdl.application.*;
import org.denalo.rshc.rekingdl.graphics.*;

public class Rekin
	{
		private static RenderLayer layer;
		private static GameApplication game;
		private static GameConfig config;
		private static Canvas canvas;

		public static void setCanvas ( Canvas canvas )
			{
				Rekin.canvas = canvas;
			}

		public static Canvas getCanvas ( )
			{
				return canvas;
			}

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
				Debugger.initialize ( );
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
						if ( Rekin.getConfig ( ).isLockScreenOrientation ( ) )
							{
								Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );
							}
						else
							{
								Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
							}
					}
				else
					{
						if ( Rekin.getConfig ( ).isLockScreenOrientation ( ) )
							{
								Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );
							}
						else
							{
								Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT );
							}
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

		public static InputStream getAssets ( String name )
			{
				InputStream is = null;
				AssetManager asm = Rekin.getGame ( ).getAssets ( );
				try
					{
						is = asm.open ( name );
					}
				catch (IOException e)
					{}
				return is;
			}

	}
