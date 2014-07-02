package org.denalo.rshc.rekingdl.system;

public class Config
{
	private boolean lockOrientation;
	private Rekin.Display.Orientation screenOrientation;
	private boolean fullscreen;
	
	public Config ( ) {
		this.lockOrientation = true;
		this.screenOrientation = Rekin.Display.Orientation.HORIZONTAL;
		this.fullscreen = true;
		}

	public void setFullscreen ( boolean fullscreen )
		{
			this.fullscreen = fullscreen;
		}

	public boolean isFullscreen ( )
		{
			return fullscreen;
		}

	public void setScreenOrientation ( Rekin.Display.Orientation screenOrientation )
		{
			this.screenOrientation = screenOrientation;
		}

	public Rekin.Display.Orientation getScreenOrientation ( )
		{
			return screenOrientation;
		}

	public void setLockOrientation ( boolean lockOrientation )
		{
			this.lockOrientation = lockOrientation;
		}

	public boolean isLockOrientation ( )
		{
			return lockOrientation;
		}
	
}
