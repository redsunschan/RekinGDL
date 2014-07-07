
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
				Rekin.setCanvas ( canvas );
			}

		public Canvas getCanvas ( )
			{
				return Rekin.getCanvas ( );
			}

		public void initialize ( SurfaceHolder holder )
			{
				this.setHolder ( holder );
				this.isStart ( true );
				this.start ( );
			}

		public void run ( )
			{
				long frameCounter = 0;
				long lastFpsTime = 0;
				while ( this.started ( ) )
					{
						long requestFlag = System.currentTimeMillis ( );
						this.canvas = null;
						try
							{
								this.setCanvas ( this.getHolder ( ).lockCanvas ( ) );
								synchronized ( this.getHolder ( ) )
									{
										this.getCanvas ( ).drawColor ( Color.BLACK );
										SceneManager.getCurrent ( ).update ( );
										Debugger.updateFrames ( );
										this.render ( this.getCanvas ( ) );
									}
								frameCounter++;

								long delay = System.currentTimeMillis ( ) - lastFpsTime;
								if ( delay > 1000 )
									{
										double FPS = ( ( (double)frameCounter ) / delay ) * 1000;
										Debugger.setFramePerSecond ( (long)FPS );
										frameCounter = 0;
										lastFpsTime = System.currentTimeMillis ( );
									}
							}
						finally
							{
								if ( this.getCanvas ( ) != null )
									{
										this.getHolder ( ).unlockCanvasAndPost ( this.getCanvas ( ) );
										Debugger.setRenderTime ( System.currentTimeMillis ( ) - requestFlag );
									}
							}

					}
			}

		public void render ( Canvas canvas )
			{
				Debugger.updateRenderInfo ( );
				Debugger.printMsg ( true );
				RenderSet.render ( canvas );
			}
	}
