package org.denalo.rshc.rekin.library.game.scene;

import android.graphics.Canvas;
import org.denalo.rshc.rekin.library.system.Debug;

public abstract class Scene extends Thread
	{
		
		protected boolean run;
		protected Canvas canvas;
		
		protected abstract void initialize ( );
		
		protected abstract void update ( );
		
		@Override
		public void start ( Canvas canvas )
			{
				Debug.print ( "Game Scene Started " );
				this.canvas = canvas;
				super.start ( );
				this.initialize ( );
			}

		@Override
		public void run ( )
			{
				super.run ( );
				while ( run ) {
					this.update ( );
				}
			}

		public void setRun ( boolean run ) {
			this.run = run;
		}
		
}
