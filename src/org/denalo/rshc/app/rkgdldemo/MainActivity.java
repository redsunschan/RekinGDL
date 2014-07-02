package org.denalo.rshc.app.rkgdldemo;

import android.os.*;
import org.denalo.rshc.rekingdl.application.*;
import org.denalo.rshc.rekingdl.scene.*;

public class MainActivity extends GameApplication
	{

		@Override
		protected void initialize ( )
			{
			}

		@Override
		protected void main ( )
			{
				SceneManager.call ( new MainScene ( ) );
			}

}
