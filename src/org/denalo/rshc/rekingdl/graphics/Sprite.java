package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import android.util.*;

public class Sprite
	{

		protected int id;
		protected Bitmap texture;
		protected int x , y;
		protected Paint span;

		public Sprite ( Viewport view )
			{
				view.add ( this );
			}

		public void setId ( int id )
			{
				this.id = id;
			}

		public int getId ( )
			{
				return id;
			}

		public void setSpan ( Paint span )
			{
				this.span = span;
			}

		public Paint getSpan ( )
			{
				return span;
			}

		public void setX ( int x )
			{
				this.x = x;
				Log.w ( this.getClass().getSimpleName ( ) , "Current X : " + String.valueOf ( this.getX() ) );
			}

		public int getX ( )
			{
				return x;
			}

		public void setY ( int y )
			{
				this.y = y;
			}

		public int getY ( )
			{
				return y;
			}


		public void setTexture ( Bitmap texture )
			{
				this.texture = texture;
			}

		public Bitmap getTexture ( )
			{
				return texture;
			}
	}
