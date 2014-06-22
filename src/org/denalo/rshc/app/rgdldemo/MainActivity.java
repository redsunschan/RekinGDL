package org.denalo.rshc.app.rgdldemo;

import org.denalo.rshc.rekingdl.application.*;
import org.denalo.rshc.rekingdl.system.*;

public class MainActivity extends GameApplication
	{

		@Override
		public void initialize ( )
			{
				this.config.setLockOrientation ( false );
				this.config.setScreenOrientation ( Rekin.Display.Orientation.HORIZONTAL );
				Rekin.initialize ( this , this.config );
			}


		@Override
		protected void start ( )
			{
				Rekin.main ( new MainScene ( ) );
			}
	}
