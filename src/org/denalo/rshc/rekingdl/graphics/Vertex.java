package org.denalo.rshc.rekingdl.graphics;

import org.denalo.rshc.rekingdl.system.*;

public class Vertex
	{
		protected float x , y;

		public Vertex ( float x, float y )
			{
				this.x = x;
				this.y = y;
			}
		public void setX ( float newx )
			{
				this.x = ( Display.getWidth ( ) / 2 ) + newx;
			}

		public float getX ( )
			{
				return x;
			}

		public void setY ( float newy )
			{
				this.y = ( Display.getHeight ( ) / 2 ) + newy;
			}

		public float getY ( )
			{
				return y;
			}

		public void moveTo ( float x , float y )
			{
				this.setX ( x );
				this.setY ( y );
			}
			
		public double distance ( Vertex vertex )
			{
				return Math.sqrt ( ( Math.pow ( ( double ) vertex.getX ( ) - ( double ) this.getX ( ), 2 ) + Math.pow ( ( double ) vertex.getY ( ) - ( double ) this.getY ( ), 2 ) ) );
			}

		public boolean equal ( float x , float y )
			{
				if ( this.getX ( ) == x && this.getY ( ) == y )
					{
						return true;
					}
				return false;
			}

		public boolean equal ( Vertex vertex )
			{
				if ( this.getX ( ) == vertex.getX ( ) && this.getY ( ) == vertex.getY ( ) )
					{
						return true;
					}
				return false;
			}

		public void add ( Vertex other )
			{
				this.setX ( this.getX ( ) + other.getX ( ) );
				this.setY ( this.getY ( ) + other.getY ( ) );
			}

		public void move ( float x , float y )
			{
				this.setX ( this.getX ( ) + x - ( Display.getWidth ( ) / 2 ) );
				this.setY ( this.getY ( ) + y - ( Display.getHeight ( ) / 2 ) );
			}

		public void negate ( )
			{
				this.setX ( -this.getX ( ) );
				this.setY ( -this.getY ( ) );
			}

	}
