package org.denalo.rshc.rekingdl.system;
<<<<<<< HEAD

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
=======
import android.content.pm.*;
import android.util.*;
import android.view.*;
import org.denalo.rshc.rekingdl.application.*;
import org.denalo.rshc.rekingdl.scene.*;

public class Rekin
	{
		private static GameApplication game;
		private static Config config;
		private static GameScene scene;

		public static void initialize ( GameApplication start , Config config )
			{
				Rekin.game = start;
				Rekin.config = Rekin.game.config;
				Rekin.Display.initialize ( );
				Cache.initialize ( );
				if ( Rekin.config.isFullscreen ( ) )
					{
						Rekin.getGame ( ).getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN );
						Rekin.getGame ( ).requestWindowFeature ( Window.FEATURE_NO_TITLE );
					}
				if ( Rekin.config.getScreenOrientation ( ) == Rekin.Display.Orientation.HORIZONTAL )
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
					}
				else if ( Rekin.config.getScreenOrientation ( ) == Rekin.Display.Orientation.VERTICAL )
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT );
					}
				if ( Rekin.config.isLockOrientation ( ) )
					{
						Rekin.getGame ( ).setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_LOCKED );
					}
			}

		/**
		 * Rekin Game Start Point
		 */
		public static void main ( GameScene scene )
			{
				Rekin.game.setContentView ( new RenderLayer ( ) );
				Rekin.scene = scene;
			}

		public static GameApplication getGame ( )
			{
				return Rekin.game;
			}

		public static Config getConfig ( )
			{
				return Rekin.config;
			}

		public static GameScene getScene ( )
			{
				return Rekin.scene;
			}

		public static class Display
			{
				public final static DisplayMetrics metrics = new DisplayMetrics ( );
				private static int width , height;

				public static void initialize ( )
					{
						Rekin.getGame ( ).getWindowManager ( ).getDefaultDisplay ( ).getMetrics ( Rekin.Display.metrics );
						Rekin.Display.width = Rekin.Display.metrics.widthPixels;
						Rekin.Display.height = Rekin.Display.metrics.heightPixels;
					}

				public static int getWidth ( )
					{
						return Rekin.Display.width;
					}

				public static int getHeight ( )
					{
						return Rekin.Display.height;
					}

				public enum Orientation
					{
						VERTICAL,
						HORIZONTAL
						}
>>>>>>> branch 'master' of https://github.com/redsunschan/RekinGDL.git
			}

	}
