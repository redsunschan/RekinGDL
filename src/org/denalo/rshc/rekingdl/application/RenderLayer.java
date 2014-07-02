package org.denalo.rshc.rekingdl.application;

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
	 }
