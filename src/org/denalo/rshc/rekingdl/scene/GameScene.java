package org.denalo.rshc.rekingdl.scene;

import android.graphics.*;
import android.util.*;
import android.view.*;
import org.denalo.rshc.rekingdl.graphics.*;

public abstract class GameScene extends Thread
	{
		protected boolean start;
		protected SurfaceHolder holder;
		protected Canvas canvas;

		public void initialize ( SurfaceHolder holder )
			{
				this.isStart ( true );
				this.holder = holder;
				this.create ( );
			}

		public abstract void create ( );

		public abstract void update ( );

		@Override
		public void run ( )
			{
				while ( this.started ( ) )
					{
						this.canvas = null;
						try
							{
								this.canvas = this.holder.lockCanvas ( );
								synchronized ( this.holder )
									{
										this.canvas.drawColor ( Color.BLACK );
										this.update ( );
										this.render ( this.canvas );
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
			}

		public void isStart ( boolean start )
			{
				this.start = start;
			}

		public boolean started ( )
			{
				return this.start;
			}
			
		public void render ( Canvas canvas )
			{
				SpriteSet.renderAll ( canvas );
			}

	}
