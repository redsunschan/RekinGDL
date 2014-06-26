package org.denalo.rshc.rekingdl.system;
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

			public static GameScene getScene ( ) {
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
			}

	}
