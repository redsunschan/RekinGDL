package org.denalo.rshc.rekin.library.application;

import org.denalo.rshc.rekin.library.system.*;

import android.app.Activity;
import android.os.Bundle;

public abstract class RekinApplication extends Activity
	{

		protected abstract void initialize ( );

		protected abstract void start ( );

		@Override
		protected void onCreate ( Bundle savedInstanceState )
			{
				Rekin.initialize ( this );
				Debug.print ( "Application Creating [ Method : onCreate ( ) ]" );
				this.initialize ( );
				super.onCreate ( savedInstanceState );
			}

		@Override
		protected void onStart ( )
			{
				Debug.print ( "Application Started [ Method : onStart ( ) ]" );
				this.start ( );
				super.onStart ( );
			}

		@Override
		protected void onStop ( )
			{
				Debug.print ( "Application Stopped..." );
				super.onStop ( );
			}

		@Override
		protected void onRestart ( )
			{
				Debug.print ( "Application Restarting..." );
				super.onRestart ( );
			}

		@Override
		protected void onResume ( )
			{
				Debug.print ( "Application Resuming..." );
				super.onResume ( );
			}

		@Override
		protected void onDestroy ( )
			{
				Debug.print ( "Application Destroyed..." );
				super.onDestroy ( );
			}

	}
