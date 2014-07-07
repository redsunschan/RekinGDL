package org.denalo.rshc.rekingdl.system;

import android.os.*;

public class GameConfig
	{
		private Display.Orientation screenOrientation;
		private int lowestSDK;
		private boolean fullScreen;
		private boolean lockScreenOrientation;
		private int width , height;

		public GameConfig ( )
			{
				this.setFullScreen ( true );
				this.setScreenOrientation ( Display.Orientation.Horizontal );
				this.setLockScreenOrientation ( true );
				this.setLowestSDK(Build.VERSION_CODES.ICE_CREAM_SANDWICH);
				this.setWidth(1920);
				this.setHeight(1080);
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

		public void setLockScreenOrientation ( boolean lockScreenOrientation )
			{
				this.lockScreenOrientation = lockScreenOrientation;
			}

		public boolean isLockScreenOrientation ( )
			{
				return lockScreenOrientation;
			}

		public void setFullScreen ( boolean fullScreen )
			{
				this.fullScreen = fullScreen;
			}

		public boolean isFullScreen ( )
			{
				return fullScreen;
			}

		public void setLowestSDK ( int lowestSDK )
			{
				this.lowestSDK = lowestSDK;
			}

		public int getLowestSDK ( )
			{
				return lowestSDK;
			}

		public void setScreenOrientation ( Display.Orientation screenOrientation )
			{
				this.screenOrientation = screenOrientation;
			}

		public Display.Orientation getScreenOrientation ( )
			{
				return screenOrientation;
			}}
