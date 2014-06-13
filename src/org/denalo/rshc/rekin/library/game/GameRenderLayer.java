package org.denalo.rshc.rekin.library.game;

import android.view.SurfaceView;
import android.view.SurfaceHolder;
import org.denalo.rshc.rekin.library.system.Rekin;
import org.denalo.rshc.rekin.library.system.Debug;

public class GameRenderLayer extends SurfaceView implements SurfaceHolder.Callback
	{

		private static GameRenderLayer instance;
		
		@Override
		public void surfaceCreated ( SurfaceHolder holder )
			{
				Debug.print ( "Render Layer's Surface Created" );
			}

		@Override
		public void surfaceChanged ( SurfaceHolder holder, int format, int width, int height )
			{
			}

		@Override
		public void surfaceDestroyed ( SurfaceHolder holder )
			{
			}

	private GameRenderLayer ( ) {
		super ( Rekin.application );
	}
	
	public static GameRenderLayer getInstance ( ) {
		if ( ! ( instance instanceof GameRenderLayer ) ) {
			instance = new GameRenderLayer ( );
		}
		return GameRenderLayer.instance;
	}
	
}
