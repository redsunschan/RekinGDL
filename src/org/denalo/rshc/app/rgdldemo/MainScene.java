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
				Texture tr = new Texture ( R.drawable.ic_launcher );
				robot = new Sprite ( tr , 0 , 0 );
				robot2 = new Sprite ( tr , -200 , -400 );
				robot3 = new Sprite ( tr , -500 , 300 );
			}

		@Override
		public void update ( )
			{
				robot.move ( 6 , 0 );
				robot2.move ( 0 , 6 );
				robot3.move ( 10 , 10 );
				if ( robot.getX ( ) > Rekin.Display.getWidth ( ) + robot.getTexture ( ).getWidth ( ) )
					{
						robot.setX ( -Rekin.Display.getWidth ( ) / 2 - robot.getTexture ( ).getWidth ( ) );
					}
				if ( robot.getX ( ) == Rekin.Display.getWidth() ) {
					robot.dispose();
				}
				if ( robot2.getY ( ) > Rekin.Display.getHeight ( ) + robot.getTexture ( ).getHeight ( ) )
					{
						robot2.setY ( -Rekin.Display.getHeight ( ) / 2 - robot.getTexture ( ).getHeight ( ) );
					}
				
			}

	}
