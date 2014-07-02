package org.denalo.rshc.rekingdl.system;

import android.os.*;

public class GameConfig
	{

		private int lowestSDK;
		private int width , height;
		private Display.Orientation screenOrientation;
		private boolean fullScreen;
		private boolean lockScreenOrientation;

		public GameConfig ( )
			{
				this.setLowestSDK ( Build.VERSION_CODES.ICE_CREAM_SANDWICH );
				this.setWidth ( 1920 );
				this.setHeight ( 1080 );
				this.setScreenOrientation ( Display.Orientation.Horizontal );
				this.setLockScreenOrientation ( true );
				this.setFullScreen ( true );
			}

		public GameConfig ( GameConfig other )
			{
				this.setLowestSDK ( other.getLowestSDK ( ) );
				this.setWidth ( other.getWidth ( ) );
				this.setHeight ( other.getHeight ( ) );
				this.setScreenOrientation ( other.getScreenOrientation ( ) );
				this.setLockScreenOrientation ( other.isLockScreenOrientation ( ) );
				this.setFullScreen ( other.isFullScreen ( ) );
			}

		public void setFullScreen ( boolean fullScreen )
			{
				this.fullScreen = fullScreen;
			}

		public boolean isFullScreen ( )
			{
				return fullScreen;
			}

		public void setLockScreenOrientation ( boolean lockScreenOrientation )
			{
				this.lockScreenOrientation = lockScreenOrientation;
			}

		public boolean isLockScreenOrientation ( )
			{
				return lockScreenOrientation;
			}

		public void setScreenOrientation ( Display.Orientation screenOrientation )
			{
				this.screenOrientation = screenOrientation;
			}

		public Display.Orientation getScreenOrientation ( )
			{
				return screenOrientation;
			}

		public void setWidth ( int width )
			{
				this.width = width;
			}

		public int getWidth ( )
			{
				return width;
			}

		public void setHeight ( int height )
			{
				this.height = height;
			}

		public int getHeight ( )
			{
				return height;
			}

		public void setLowestSDK ( int lowestSDK )
			{
				this.lowestSDK = lowestSDK;
			}

		public int getLowestSDK ( )
			{
				return lowestSDK;
			}

	}
