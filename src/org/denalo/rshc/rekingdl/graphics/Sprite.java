package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;

public class Sprite
	{
		protected int id;
		protected Rect src_rect;
		protected Texture texture;
		protected Paint span;

		public Sprite ( )
			{
				this.src_rect = new Rect ( );
				this.span = new Paint ( );
				this.span.setAntiAlias ( true );
				SpriteSet.add ( this );
			}

		public Sprite ( Texture texture )
			{
				this.src_rect = new Rect ( );
				this.span = new Paint ( );
				this.span.setAntiAlias ( true );
				this.setTexture ( texture );
				SpriteSet.add ( this );
			}

		public Sprite ( Texture texture , float x , float y )
			{
				this.src_rect = new Rect ( x , y , texture.getWidth ( ) , texture.getHeight ( ) );
				this.span = new Paint ( );
				this.span.setAntiAlias ( true );
				this.setTexture ( texture );
				SpriteSet.add ( this );
			}

		public void setId ( int id )
			{
				this.id = id;
			}

		public int getId ( )
			{
				return id;
			}

		public void setTexture ( Texture texture )
			{
				this.texture = texture;
				this.src_rect.setWidth ( this.getTexture ( ).getWidth ( ) );
				this.src_rect.setHeight ( this.getTexture ( ).getHeight ( ) );
			}

		public Texture getTexture ( )
			{
				return texture;
			}

		public Bitmap getBitmap ( )
			{
				return texture.get ( );
			}

		public void zoom ( float rate )
			{
				this.src_rect.zoom ( rate );
			}

		public void setX ( float x )
			{
				this.src_rect.setX ( x );
			}

		public float getX ( )
			{
				return this.src_rect.getX ( );
			}

		public void setY ( float y )
			{
				this.src_rect.setY ( y );
			}

		public float getY ( )
			{
				return this.src_rect.getY ( );
			}

		public void move ( float addx , float addy )
			{
				this.src_rect.move ( addx , addy );
			}

		public void setOpacity ( int opacity )
			{
				this.span.setAlpha ( opacity );
			}

		public int getOpacity ( )
			{
				return this.span.getAlpha ( );
			}

		public void setColor ( int color )
			{
				this.span.setColor ( color );
			}

		public void setColor ( int r , int g , int b )
			{
				this.span.setARGB ( this.span.getAlpha ( ) , r , g , b );
			}

		public void dispose ( )
			{
				SpriteSet.remove ( this );
			}

		public boolean havePoint ( float x , float y )
			{
				if ( x < this.getX ( ) || x > ( this.getX ( ) + this.getTexture ( ).getWidth ( ) ) )
					{
						return false;
					}
				if ( y < this.getY ( ) || y > ( this.getY ( ) - this.getTexture ( ).getHeight ( ) ) )
					{
						return false;
					}
				return true;
			}

		public Paint getSpan ( ) {
			return this.span;
		}
			
	}
