package org.denalo.rshc.rekingdl.application;

<<<<<<< HEAD
import android.graphics.*;
import android.view.*;
import org.denalo.rshc.rekingdl.system.*;

public class RenderLayer extends SurfaceView
	{
		public RenderLayer ( )
			{
				super ( Rekin.getGame ( ) );
				this.setFocusable ( true );
				this.getHolder ( ).addCallback ( new Renderer ( this ) );
			}
=======
import android.annotation.SuppressLint;
import android.util.*;
import android.view.*;
import org.denalo.rshc.rekingdl.system.*;

@SuppressLint("ViewConstructor")
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
				return super.onTouchEvent ( event );
			}


>>>>>>> e17dc039c9a78e00120613c04ca31afae7f729ad
	}
