package org.denalo.rshc.rekingdl.application;

import android.graphics.*;
import android.util.*;
import android.view.*;
import org.denalo.rshc.rekingdl.scene.*;
import org.denalo.rshc.rekingdl.system.*;

public class RenderLayer extends SurfaceView implements SurfaceHolder.Callback
	{

		public RenderLayer ( )
			{
				super ( Rekin.getGame ( ) );
				this.getHolder ( ).addCallback ( this );
			}
		@Override
		public void surfaceCreated ( SurfaceHolder holder )
			{
				Rekin.getScene ( ).initialize ( holder );
				Rekin.getScene ( ).start ( );
			}
		@Override
		public void surfaceChanged ( SurfaceHolder holder, int format, int width, int height )
			{
			}

		@Override
		public void surfaceDestroyed ( SurfaceHolder holder )
			{
				boolean retry = true;
				while ( retry )
					{
						try
							{
								Rekin.getScene ( ).join ( );
								retry = false;
							}
						catch (InterruptedException e)
							{
								// try again shutting down the thread
							}
					}
			}

		@Override
		public boolean onTouchEvent ( MotionEvent event )
			{
				Log.w ( this.getClass ( ).getSimpleName ( ) , "Touching Coordinate: [ " + String.valueOf ( event.getX ( ) ) + " , " + String.valueOf ( event.getY ( ) ) + " ]" );
				Rekin.touchedx = event.getX ( );
				Rekin.touchedy = event.getY ( );
				return super.onTouchEvent ( event );
			}


	}
