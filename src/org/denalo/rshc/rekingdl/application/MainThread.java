package org.denalo.rshc.rekingdl.application;

import android.graphics.*;
import android.view.*;
import org.denalo.rshc.rekingdl.system.*;

import org.denalo.rshc.rekingdl.system.Display;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.graphics.*;

public class MainThread extends Thread
	{
		private SurfaceHolder holder;
		private Canvas canvas;
		private boolean started;

		public void isStart ( boolean started )
			{
				this.started = started;
			}

		public boolean started ( )
			{
				return started;
			}

		public void setHolder ( SurfaceHolder holder )
			{
				this.holder = holder;
			}

		public SurfaceHolder getHolder ( )
			{
				return holder;
			}

		public void setCanvas ( Canvas canvas )
			{
				this.canvas = canvas;
			}

		public Canvas getCanvas ( )
			{
				return canvas;
			}

		public void initialize ( SurfaceHolder holder )
			{
				this.setHolder ( holder );
				this.isStart ( true );
				this.start ( );
			}

		public void run ( )
			{
				while ( this.started ( ) )
					{
						this.canvas = null;
						Debugger.countFrame ( );
						try
							{
								this.setCanvas ( this.getHolder ( ).lockCanvas ( ) );
								synchronized ( this.getHolder ( ) )
									{
										this.getCanvas ( ).drawColor ( Color.BLACK );
										SceneManager.getCurrent ( ).update ( );
										this.render ( this.getCanvas ( ) );
									}
							}
						finally
							{
								if ( this.getCanvas ( ) != null )
									{
										this.getHolder ( ).unlockCanvasAndPost ( this.getCanvas ( ) );
									}
							}
					}
			}

		public void render ( Canvas canvas )
			{
				RenderSet.render ( canvas );
			}
	}
