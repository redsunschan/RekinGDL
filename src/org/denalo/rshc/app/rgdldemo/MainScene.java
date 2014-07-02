package org.denalo.rshc.app.rgdldemo;

import org.denalo.rshc.rekingdl.graphics.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class MainScene extends GameScene
	{

		Sprite robot;
		Sprite robot2;
		Sprite robot3;

		@Override
		public void create ( )
			{
				Texture tr = Cache.loadTexture ( "ic_launcher" );
				robot = new Sprite ( tr , 400 , 0 );
				robot2 = new Sprite ( tr , -400 , 0 );
			}

		@Override
		public void update ( )
			{
				robot.move ( -3 , 0 );
				robot2.move ( 3 , 0 );
			}

	}
