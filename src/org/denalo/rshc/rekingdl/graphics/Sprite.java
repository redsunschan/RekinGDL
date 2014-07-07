package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import android.util.*;

public class Sprite
	{

		protected int id;
		protected Texture texture;
		protected Vertex coordinate;
		protected Paint span;

		public Sprite ( Viewport view )
			{
				this.initialize ( new Vertex ( 0 , 0 ) );
				view.add ( this );
			}

		public Sprite ( Vertex vertex )
			{
				this.initialize ( vertex );
				RenderSet.get ( 0 );
			}

		private void initialize ( Vertex vertex )
			{
				this.coordinate = vertex;
				this.span = new Paint ( );
			}

		public void setId ( int id )
			{
				this.id = id;
			}

		public int getId ( )
			{
				return id;
			}

		public Paint getSpan ( )
			{
				return span;
			}

		public void move ( float x , float y )
			{
				this.coordinate.move ( x , y );
			}

		public void setX ( float x )
			{
				this.coordinate.setX ( x );
			}

		public float getX ( )
			{
				return this.coordinate.getX ( );
			}

		public void setY ( float y )
			{
				this.coordinate.setY ( y );
			}

		public float getY ( )
			{
				return this.coordinate.getY ( );
			}


		public void setTexture ( Texture texture )
			{
				this.texture = texture;
			}

		public Texture getTexture ( )
			{
				return texture;
			}

		public void setOpacity ( int alpha )
			{
				this.getSpan ( ).setAlpha ( alpha );
			}

		public int getOpacity ( )
			{
				return this.getSpan ( ).getAlpha ( );
			}

		public void setTone ( int r , int g , int b )
			{
				this.getSpan ( ).setARGB ( this.getOpacity ( ) , r , g , b );
			}

	}
