package org.denalo.rshc.rekingdl.application;

import android.app.*;
import android.content.*;
import org.denalo.rshc.rekingdl.system.*;

public class FCWindow
	{
		private AlertDialog.Builder dialog;
		private String message;

		public FCWindow ( String msg )
			{
				this.setMessage ( msg );
				this.dialog = new AlertDialog.Builder ( Rekin.getGame ( ) );
				this.dialog.setTitle ( "Error Found..." );
				this.dialog.setMessage ( this.getMessage ( ) );
				this.dialog.setPositiveButton ( "Close" , new DialogInterface.OnClickListener ( ){
							@Override
							public void onClick ( DialogInterface dialog, int which )
								{
									dialog.dismiss ( );
									Rekin.getGame ( ).finish ( );
									System.gc ( );
									System.exit ( -1 );
								}					
						} ).show ( );
			}


		private void setMessage ( String message )
			{
				this.message = message;
			}

		public String getMessage ( )
			{
				return message;
			}
	}
