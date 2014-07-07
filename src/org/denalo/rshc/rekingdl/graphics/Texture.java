package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import java.io.*;
import org.denalo.rshc.rekingdl.system.*;

public class Texture
	{
		protected Bitmap src;
		protected int width , height;

		public Texture ( String name )
			{
				this.src = BitmapFactory.decodeStream ( Rekin.getAssets ( name + ".png" ) );
				this.setWidth ( this.getSrc ( ).getWidth ( ) );
				this.setHeight ( this.getSrc ( ).getWidth ( ) );
			}

		public Texture ( int resid )
			{
				this.src = BitmapFactory.decodeResource ( Rekin.getGame ( ).getResources ( ) , resid );
				this.setWidth ( this.getSrc ( ).getWidth ( ) );
				this.setHeight ( this.getSrc ( ).getWidth ( ) );
			}

		public Bitmap getSrc ( )
			{
				return src;
			}

		private void setWidth ( int width )
			{
				this.width = width;
			}

		public int getWidth ( )
			{
				return width;
			}

		private void setHeight ( int height )
			{
				this.height = height;
			}

		public int getHeight ( )
			{
				return height;
			}

	}
