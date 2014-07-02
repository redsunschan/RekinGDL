package org.denalo.rshc.rekingdl.graphics;

import android.content.res.*;
import android.graphics.*;
import org.denalo.rshc.rekingdl.system.*;
import java.io.*;

public class Texture
	{

		protected Bitmap bitmap;
		protected Matrix matrix;
		protected float zoomX = 1 , zoomY = 1;

		public Texture ( String filename )
			{
				AssetManager asm = Rekin.getGame ( ).getAssets ( );
				try
					{
						InputStream input = asm.open ( filename + ".png" );
						this.bitmap = BitmapFactory.decodeStream ( input );
						input.close ( );
					}
				catch (IOException e)
					{e.printStackTrace ( );}
			}

		public Texture ( int resid )
			{
				this.bitmap = BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , resid );
			}

		public Bitmap get ( )
			{
				return this.bitmap;
			}

		public float getWidth ( )
			{
				return this.bitmap.getWidth ( );
			}

		public float getHeight ( )
			{
				return this.bitmap.getHeight ( );
			}

	}
