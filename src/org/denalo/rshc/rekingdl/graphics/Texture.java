package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import org.denalo.rshc.rekingdl.system.*;

public class Texture
	{

		protected Bitmap bitmap;

		public Texture ( String filename )
			{
				this.bitmap = BitmapFactory.decodeFile ( filename + ".png" );
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
