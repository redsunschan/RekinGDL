package org.denalo.rshc.rekingdl.application;

import android.app.*;
import android.os.*;
import org.denalo.rshc.rekingdl.system.*;

public abstract class GameApplication extends Activity
	{

		protected GameConfig config = new GameConfig ( );
		
		protected abstract void initialize ( );
		
		protected abstract void main ( );
		
		@Override
		protected void onCreate ( Bundle savedInstanceState )
			{
				this.initialize ( );
				Rekin.initialize ( this , this.config );
				super.onCreate ( savedInstanceState );
				this.main ( );
				Rekin.main ( );
				this.setContentView ( new RenderLayer ( ) );
			}

		@Override
		protected void onPause ( )
			{
				// TODO: Implement this method
				super.onPause ( );
			}

		@Override
		protected void onStop ( )
			{
				// TODO: Implement this method
				super.onStop ( );
			}

		@Override
		protected void onResume ( )
			{
				// TODO: Implement this method
				super.onResume ( );
			}

		@Override
		protected void onRestart ( )
			{
				// TODO: Implement this method
				super.onRestart ( );
			}

		@Override
		protected void onPostResume ( )
			{
				
				super.onPostResume ( );
			}

		@Override
		public void onBackPressed ( )
			{
				new ExitWindow ( );
			}
}

