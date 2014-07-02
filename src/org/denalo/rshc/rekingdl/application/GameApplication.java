package org.denalo.rshc.rekingdl.application;

import android.app.*;
import android.os.*;
import org.denalo.rshc.rekingdl.system.*;
<<<<<<< HEAD

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

=======
import android.content.*;

public abstract class GameApplication extends Activity
	{

		public Config config = new Config ( );
		protected RenderLayer view;

		public abstract void initialize ( );

		protected abstract void start ( );

		@Override
		protected void onCreate ( Bundle savedInstanceState )
			{
				this.initialize ( );
				super.onCreate ( savedInstanceState );
				this.start ( );
			}

		@Override
		protected void onPause ( )
			{
				Rekin.getScene ( ).isStart ( false );
				super.onPause ( );
			}

		@Override
		protected void onStop ( )
			{
				Rekin.getScene ( ).isStart ( false );
				super.onStop ( );
			}

		@Override
		protected void onRestart ( )
			{
				Rekin.getScene ( ).isStart ( true );
				super.onRestart ( );
			}

		@Override
		protected void onResume ( )
			{
				Rekin.getScene ( ).isStart ( true );
				super.onResume ( );
			}

		@Override
		protected void onStart ( )
			{
				Rekin.getScene ( ).isStart ( true );
				super.onStart ( );
			}



		public void setView ( RenderLayer view )
			{
				this.view = view;
				super.setContentView ( view );
			}

		public RenderLayer getView ( )
			{
				return this.view;
			}

		@Override
		public void onBackPressed ( )
			{
				AlertDialog.Builder dialog = new AlertDialog.Builder ( this );
				dialog.setTitle ( "Exit Confirm" );
				dialog.setMessage ( "Really Want To Exit?" );
				dialog.setPositiveButton ( "Yes", new AlertDialog.OnClickListener ( ){

							@Override
							public void onClick ( DialogInterface dialog, int which )
								{
									GameApplication.this.finish ( );
									System.gc ( );
									System.exit ( 0 );
								}
						} );
				dialog.setNegativeButton ( "No" , new DialogInterface.OnClickListener ( ) {

							@Override
							public void onClick ( DialogInterface dialog, int which )
								{
									dialog.cancel ( );
									dialog.dismiss ( );
								}


						} );
				dialog.show ( );
			}
	}
>>>>>>> e17dc039c9a78e00120613c04ca31afae7f729ad
