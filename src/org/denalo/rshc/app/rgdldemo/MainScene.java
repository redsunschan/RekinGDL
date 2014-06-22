package org.denalo.rshc.app.rgdldemo;

import android.graphics.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class MainScene extends GameScene
	{

		@Override
		public void update ( )
			{
				this.canvas.drawBitmap ( BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , R.drawable.ic_launcher ) , Rekin.touchedx , Rekin.touchedy , null );
			}

}
