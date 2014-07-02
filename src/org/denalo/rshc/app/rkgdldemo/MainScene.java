package org.denalo.rshc.app.rkgdldemo;

import android.graphics.*;
import android.util.*;
import org.denalo.rshc.rekingdl.graphics.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class MainScene extends GameScene
	{

		Viewport view;
		Viewport view2;
		Sprite robot;
		Sprite robot2;
		int i = 0;

		@Override
		public void initialize ( )
			{
				view = new Viewport ( 10 );
				view2 = new Viewport ( 0 );
				robot = new Sprite ( view );
				robot.setTexture ( BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , R.drawable.ic_launcher ) );
				robot.setX ( 20 );
				robot.setY ( 50 );
				robot2 = new Sprite ( view2 );
				robot2.setTexture ( BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , R.drawable.ic_launcher ) );
				robot2.setX ( 35 );
				robot2.setY ( 50 );
				Log.wtf ( this.getClass ( ).getSimpleName ( ) , "Initialized..." );
			}

		@Override
		public void update ( )
			{
				Log.wtf ( this.getClass ( ).getSimpleName ( ) , "Updating..." );
				i+=6;
				robot.setX ( i );
				if ( robot.getX ( ) == Display.getWidth ( ) / 2 )
					{
						SceneManager.call ( new SecondScene ( ) );
					}
			}

	}
