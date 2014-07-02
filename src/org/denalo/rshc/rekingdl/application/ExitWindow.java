package org.denalo.rshc.rekingdl.application;
import android.app.*;
import org.denalo.rshc.rekingdl.system.*;
import android.content.*;

public class ExitWindow
	{
		public ExitWindow ( )
			{
				AlertDialog.Builder dialog = new AlertDialog.Builder ( Rekin.getGame ( ) );
				dialog.setTitle ( "Exit?" );
				dialog.setMessage ( "Confirm to exit?" );
				dialog.setPositiveButton ( "Yes" , new DialogInterface.OnClickListener ( ) {
							@Override
							public void onClick ( DialogInterface dialog, int which )
								{
									dialog.dismiss ( );
									Rekin.getGame ( ).finish ( );
									System.exit ( 0 );
								}
						} );
				dialog.setNegativeButton ( "No" , new DialogInterface.OnClickListener ( ) {
							@Override
							public void onClick ( DialogInterface dialog, int which )
								{
									dialog.dismiss ( );
								}
						} );
				dialog.show ( );
			}
	}
