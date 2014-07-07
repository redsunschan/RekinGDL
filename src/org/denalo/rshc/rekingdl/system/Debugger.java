package org.denalo.rshc.rekingdl.system;

import android.graphics.*;
import org.denalo.rshc.rekingdl.graphics.*;

public class Debugger
	{
		private static Paint textConfig = new Paint ( );
		private static long startTime;
		private static long totalRuntime = 0;
		private static long secondFlag = 0;
		private static long everyRequest = 0;
		private static long framePerSecond = 0;
		private static long totalFrames = 0;
		private static long totalRequestSprite = 0;
		
		public static void initialize ( )
			{
				startTime = System.currentTimeMillis ( );
				textConfig.setTextSize ( 50 );
				textConfig.setColor ( Color.WHITE );
				textConfig.setAntiAlias ( true );
			}

		public static void updateRenderInfo ( )
			{
				setTotalRuntime ( System.currentTimeMillis ( ) - startTime );
				setTotalRequestSprite ( RenderSet.count ( ) );
			}

		private static void setTotalRequestSprite ( long totalRequestSprite )
			{
				Debugger.totalRequestSprite = totalRequestSprite;
			}

		public static long getTotalRequestedSprites ( )
			{
				return totalRequestSprite;
			}

		public static void setRenderTime ( long time )
			{
				everyRequest = time;
			}

		public static long getRenderTime ( )
			{
				return everyRequest;
			}

		public static void updateFrames ( )
			{
				Debugger.totalFrames++;
			}

		public static long getTotalFrames ( )
			{
				return totalFrames;
			}

		public static void setFramePerSecond ( long fps )
			{
				Debugger.framePerSecond = fps;
			}

		public static long getFramePerSecond ( )
			{
				return Debugger.framePerSecond;
			}

		private static void setTotalRuntime ( long totalRuntime )
			{
				Debugger.totalRuntime = totalRuntime;
			}

		public static long getTotalRuntime ( )
			{
				return totalRuntime;
			}

		public static void printMsg ( boolean bool )
			{
				if ( bool )
					{
						Rekin.getCanvas ( ).drawText ( "Running Time : " + String.valueOf ( Debugger.getTotalRuntime ( ) / 1000 ) + " Sec." , 0 , 35 , Debugger.textConfig );
						Rekin.getCanvas ( ).drawText ( "Total Rendered Frames : " + String.valueOf ( Debugger.getTotalFrames ( ) ) , 0 , 85 , Debugger.textConfig );
						Rekin.getCanvas ( ).drawText ( "Every Render Request Time : " + String.valueOf ( Debugger.getRenderTime ( ) ) + " M.Sec." , 0 , 135 , Debugger.textConfig );
						Rekin.getCanvas ( ).drawText ( "Total Requested Sprite : " + String.valueOf ( Debugger.getTotalRequestedSprites ( ) ) , 0 , 185 , Debugger.textConfig );
						Rekin.getCanvas ( ).drawText ( "Frame per Sec. : " + String.valueOf ( Debugger.getFramePerSecond ( ) ) , 0 , 235 , Debugger.textConfig ); 
					}
			}

		public static long getSecondFlag ( )
			{
				return secondFlag;
			}

	}
