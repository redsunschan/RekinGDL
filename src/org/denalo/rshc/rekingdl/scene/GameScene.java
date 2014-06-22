package org.denalo.rshc.rekingdl.scene;

import android.graphics.*;
import android.util.*;
import android.view.*;

public abstract class GameScene extends Thread
	{
		protected boolean start;
		protected SurfaceHolder holder;
		protected Canvas canvas;

		public void initialize ( SurfaceHolder holder )
			{
				this.isStart ( true );
				this.holder = holder;
			}

		public abstract void update ( );

		@Override
		public void run ( )
			{
				Log.w ( this.getClass ( ).getSimpleName ( ) , "Game Scene Starting..." );
				long updateTime = 0;
				while ( this.started ( ) )
					{
						updateTime++;
						this.canvas = null;
						try
							{
								this.canvas = this.holder.lockCanvas ( );
								synchronized ( this.holder )
									{
										this.canvas.drawColor ( Color.BLACK );
										this.update ( );
									}
							}
						finally
							{
								if ( this.canvas != null )
									{
										this.holder.unlockCanvasAndPost ( canvas );
									}
							}
					}
				Log.w ( this.getClass().getSimpleName() , "Updated : " + String.valueOf ( updateTime ) + " Times" );
			}

		public void isStart ( boolean start )
			{
				this.start = start;
			}

		public boolean started ( )
			{
				return this.start;
			}

	}
