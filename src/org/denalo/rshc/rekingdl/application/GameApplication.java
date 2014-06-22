package org.denalo.rshc.rekingdl.application;

import android.app.*;
import android.os.*;
import org.denalo.rshc.rekingdl.system.*;
import android.content.*;

public abstract class GameApplication extends Activity
	{

		public Config config = new Config ( );

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
