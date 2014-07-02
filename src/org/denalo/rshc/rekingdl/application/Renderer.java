package org.denalo.rshc.rekingdl.application;

import android.util.*;
import android.view.*;
import org.denalo.rshc.rekingdl.system.*;

public class Renderer implements SurfaceHolder.Callback
	{
		public Renderer ( RenderLayer layer )
			{
				Rekin.setLayer ( layer );
			}

		@Override
		public void surfaceCreated ( SurfaceHolder holder )
			{
				new MainThread ( ).initialize ( holder );
			}

		@Override
		public void surfaceChanged ( SurfaceHolder holder, int format , int width , int height )
			{
			}

		@Override
		public void surfaceDestroyed ( SurfaceHolder holder )
			{
			}

	}
