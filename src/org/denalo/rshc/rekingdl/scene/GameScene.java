package org.denalo.rshc.rekingdl.scene;

<<<<<<< HEAD
public abstract class GameScene
{
	public abstract void initialize ( );
	
	public abstract void update ( );
	
}
=======
import android.graphics.*;
import android.view.*;
import org.denalo.rshc.rekingdl.graphics.*;
import org.denalo.rshc.rekingdl.system.*;

public abstract class GameScene extends Thread
	{
		protected boolean initialized;
		protected boolean start;
		protected SurfaceHolder holder;
		protected Canvas canvas;

		public void initialize ( SurfaceHolder holder )
			{
				if ( ! this.initialized )
					{
						this.isStart ( true );
						this.holder = holder;
						this.initialized = true;
						this.start ( );
						this.create ( );
					}
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
>>>>>>> e17dc039c9a78e00120613c04ca31afae7f729ad
