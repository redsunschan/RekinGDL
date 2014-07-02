package org.denalo.rshc.rekingdl.graphics;

public class Rect extends Coord
	{

		protected float width , height;

		public Rect ( )
			{
				super ( 0 , 0 );
				this.setWidth ( 1 );
				this.setHeight ( 1 );
			}

		public Rect ( float x , float y , float width , float height )
			{
				super ( x , y );
				this.setWidth ( width );
				this.setHeight ( height );
			}

		public Rect ( Rect other )
			{
				super ( other.getX ( ) , other.getY ( ) );
				this.setWidth ( other.getWidth ( ) );
				this.setHeight ( other.getHeight ( ) );
			}

		public void setWidth ( float width )
			{
				this.width = width;
			}

		public float getWidth ( )
			{
				return width;
			}

		public void setHeight ( float height )
			{
				this.height = height;
			}

		public float getHeight ( )
			{
				return height;
			}

		public void zoom ( float rate )
			{
				this.setWidth ( this.getWidth ( ) * rate );
				this.setHeight ( this.getHeight ( ) * rate );
			}

		public Coord getTopRightPoint ( )
			{
				return new Coord ( this.getX ( ) + this.getWidth ( ) , this.getY ( ) );
			}

		public Coord getBottomLeftPoint ( )
			{
				return new Coord ( this.getX ( ) , this.getY ( ) - this.getWidth ( ) );
			}

		public Coord getBottomRight ( )
			{
				return new Coord ( this.getX ( ) + this.getWidth ( ) , this.getY ( ) - this.getHeight ( ) );
			}

		public Coord getCenterPoint ( )
			{
				return new Coord ( this.getX ( ) + ( this.getWidth ( ) / 2 ) , this.getY ( ) - ( this.getHeight ( ) / 2 ) );
			}

	}
