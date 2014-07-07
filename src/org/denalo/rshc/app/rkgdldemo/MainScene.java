package org.denalo.rshc.app.rkgdldemo;

import android.graphics.*;
import android.util.*;
import org.denalo.rshc.rekingdl.graphics.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class MainScene extends GameScene
	{

		Viewport view;
		Sprite robot;
		Sprite robot2;

		@Override
		public void initialize ( )
			{
				view = new Viewport ( 10 );
				Viewport view2 = new Viewport ( 11 );
				robot = new Sprite ( this.view );
				robot.setTexture ( new Texture ( "ic_launcher" ) );
				robot.setX ( - ( Display.getWidth ( ) / 2 ) );
				robot.setY ( 0 );
				robot2 = new Sprite ( view2 );
				robot2.setTexture ( new Texture ( R.drawable.ic_launcher ) );
				robot2.setX ( Display.getWidth ( ) / 2 );
				robot2.setY ( 0 );
			}

		@Override
		public void update ( )
			{
				robot.move ( 1 , 0 );
				robot2.move ( -3 , 0 );
			}

	}
