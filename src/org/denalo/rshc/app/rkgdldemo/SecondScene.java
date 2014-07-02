package org.denalo.rshc.app.rkgdldemo;

import android.graphics.*;
import org.denalo.rshc.rekingdl.graphics.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class SecondScene extends GameScene
	{

		public Viewport v;
		public Sprite s;

		@Override
		public void initialize ( )
			{
				v = new Viewport ( 0 );
				s = new Sprite ( v );
				s.setTexture ( BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , R.drawable.ic_launcher ) );
				s.setX ( 50 );
				s.setY ( 60 );
			}

		@Override
		public void update ( )
			{
				s.setX ( s.getX ( ) + 1 );
			}


	}
