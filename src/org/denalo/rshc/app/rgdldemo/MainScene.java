package org.denalo.rshc.app.rgdldemo;

import android.graphics.*;
import org.denalo.rshc.rekingdl.graphics.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class MainScene extends GameScene
	{

		private Coord coord = new Coord ( 0 , 0 );

		@Override
		public void update ( )
			{
				Bitmap robot = BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , R.drawable.ic_launcher );
				Paint xy = new Paint ( );
				xy.setAntiAlias ( true );
				xy.setColor ( Color.RED );
				xy.setTextSize ( 42 );
				this.canvas.drawText ( "Current X : " + String.valueOf ( coord.getX ( ) ) , 0 , 45 , xy );
				this.canvas.drawText ( "Current Y : " + String.valueOf ( coord.getY ( ) ) , 0 , 90 , xy );
				this.canvas.drawBitmap ( robot , coord.getX ( ) , coord.getY ( ) , null );
				coord.move ( 5 , 0 );
				if ( coord.getX ( ) > Rekin.Display.getWidth ( ) )
					{
						coord.setX ( -Rekin.Display.getWidth ( ) / 2 );
					}
			}

	}
