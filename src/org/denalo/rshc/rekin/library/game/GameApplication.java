package org.denalo.rshc.rekin.library.game;

import android.view.*;

import android.content.pm.ActivityInfo;
import org.denalo.rshc.rekin.library.application.RekinApplication;

public abstract class GameApplication extends RekinApplication
	{

		@Override
		protected void initialize ( )
			{
				this.requestWindowFeature ( Window.FEATURE_NO_TITLE );
				this.setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
				this.getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN );
			}

		protected void start ( ) {
			this.setContentView ( GameRenderLayer.getInstance ( ) );
		}
	}
